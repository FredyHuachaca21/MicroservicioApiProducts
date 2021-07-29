package com.killa.microapiproducts.applications.service;

import com.killa.microapiproducts.applications.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface IProductoServiceDTO {

    List<ProductDTO> getAll();
    Optional<ProductDTO> getProduct(long productId);
}
