package be.intecbrussel.springWebApp.repositories;

import be.intecbrussel.springWebApp.domein.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository <Publisher, Long>{
}
