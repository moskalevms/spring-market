package ru.moskalevms.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.moskalevms.persist.model.Brand;


public interface BrandRepository extends JpaRepository<Brand, Long> {
}
