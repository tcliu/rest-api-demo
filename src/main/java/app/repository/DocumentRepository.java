package app.repository;

import app.model.Document;
import io.swagger.annotations.Api;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@Api(tags = "Document entity")
@RepositoryRestResource(path = "documents", collectionResourceRel = "documents")
public interface DocumentRepository extends MongoRepository<Document, String> {


}
