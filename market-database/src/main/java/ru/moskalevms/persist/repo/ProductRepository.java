package ru.moskalevms.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.moskalevms.persist.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}

