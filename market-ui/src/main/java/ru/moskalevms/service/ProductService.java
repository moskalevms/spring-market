package ru.moskalevms.service;

import ru.moskalevms.controllers.repr.ProductRepr;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<ProductRepr> findById(Long id);

    List<List<ProductRepr>> findAllAndSplitProductsBy(int groupSize);
}
