package com.killa.microapiproducts.infraestructure.service;

import com.killa.microapiproducts.applications.dto.ProductDTO;
import com.killa.microapiproducts.applications.mapper.IProductMapper;
import com.killa.microapiproducts.applications.repository.IProductRepository;
import com.killa.microapiproducts.domain.model.Product;
import com.killa.microapiproducts.infraestructure.repository.IProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductServiceDTO implements IProductRepository {

    @Autowired
    private IProductJpaRepository productJpaRepository;

    @Autowired
    private IProductMapper mapper;

    @Override
    public List<ProductDTO> getAll() {

        List<Product> products = productJpaRepository.findAll();

        return mapper.toProductsDTO(products);
    }

    @Override
    public Optional<ProductDTO> getProduct(long productId) {
        return productJpaRepository.findById(productId).map(mapper::toProductDTO);
    }
}
