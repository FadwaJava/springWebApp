package be.intecbrussel.springWebApp.repositories;

import be.intecbrussel.springWebApp.domein.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
