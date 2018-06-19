package app.repository;

import app.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "contacts", collectionResourceRel = "contacts")
public interface ContactRepository extends MongoRepository<Contact, String> {

    List<Contact> findByFirstNameBetween(String from, String to);
}
