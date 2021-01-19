package be.intecbrussel.springWebApp.repositories;

import be.intecbrussel.springWebApp.domein.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
