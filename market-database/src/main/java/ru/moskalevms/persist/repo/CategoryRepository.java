package ru.moskalevms.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.moskalevms.persist.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
