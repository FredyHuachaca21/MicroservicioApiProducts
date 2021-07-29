package com.killa.microapiproducts.applications.dto;


import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private String nombre;
    private Double precio;
}
