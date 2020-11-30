package Repos;

import Entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface MainRepos extends CrudRepository<Author, Long> {
}
