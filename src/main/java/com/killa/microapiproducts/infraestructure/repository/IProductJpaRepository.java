package com.killa.microapiproducts.infraestructure.repository;

import com.killa.microapiproducts.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductJpaRepository extends JpaRepository<Product, Long> {
}
