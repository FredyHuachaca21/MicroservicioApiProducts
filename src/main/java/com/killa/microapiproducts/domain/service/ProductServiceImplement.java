package com.killa.microapiproducts.domain.service;

import com.killa.microapiproducts.applications.dto.ProductDTO;
import com.killa.microapiproducts.applications.repository.IProductRepository;
import com.killa.microapiproducts.applications.service.IProductoServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplement implements IProductoServiceDTO {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<ProductDTO> getAll() {
        return productRepository.getAll();
    }

    @Override
    public Optional<ProductDTO> getProduct(long productId) {
        return productRepository.getProduct(productId);
    }
}
