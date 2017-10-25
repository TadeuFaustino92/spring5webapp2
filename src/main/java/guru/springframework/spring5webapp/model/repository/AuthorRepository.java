package guru.springframework.spring5webapp.model.repository;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{       // extende o spring data crud repositório, usando java generics "type" e "id"
}
