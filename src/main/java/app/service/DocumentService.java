package app.service;

import app.model.Document;
import app.repository.DocumentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DocumentService.class);

    private DocumentRepository documentRepository;

    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    public <S extends Document> S save(S entity) {
        entity.setLastModifiedDate(Calendar.getInstance().getTime());
        if (entity.getId() == null) {
            entity.setCreatedDate(entity.getLastModifiedDate());
        }
        S e = documentRepository.save(entity);
        LOGGER.info("Document {} saved.", e);
        return e;
    }

    public Optional<Document> findById(String id) {
        return Optional.ofNullable(documentRepository.findOne(id));
    }

    public void deleteById(String id) {
        documentRepository.delete(id);
        LOGGER.info("Document with id {} deleted.", id);
    }

    public void deleteAll() {
        documentRepository.deleteAll();
        LOGGER.info("All documents deleted.");
    }
}
