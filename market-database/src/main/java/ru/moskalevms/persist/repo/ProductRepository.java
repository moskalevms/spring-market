package ru.moskalevms.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.moskalevms.persist.model.Product;

import javax.validation.constraints.Max;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Long> {

}

