package com.killa.microapiproducts.applications.repository;

import com.killa.microapiproducts.applications.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {

    List<ProductDTO> getAll();
    Optional<ProductDTO> getProduct(long productId);

}
