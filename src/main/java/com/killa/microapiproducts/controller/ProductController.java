package com.killa.microapiproducts.controller;
import com.killa.microapiproducts.applications.dto.ProductDTO;
import com.killa.microapiproducts.applications.service.IProductoServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductoServiceDTO serviceDTO;

    @GetMapping("/getAll")
    public List<ProductDTO> listProductsDTO(){
        return serviceDTO.getAll();
    }

    @GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable("id") long id){
        return serviceDTO.getProduct(id).get();
    }

}
