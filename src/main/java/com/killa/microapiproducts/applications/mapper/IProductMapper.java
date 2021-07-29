package com.killa.microapiproducts.applications.mapper;

import com.killa.microapiproducts.applications.dto.ProductDTO;
import com.killa.microapiproducts.domain.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProductMapper {
    /*- SOURCE -> ORIGEN ATRIBUROS PRODUCT
    * - TARGET -> DESTINO ATRIBUTO PRODUCTTDO*/
    @Mappings({
            @Mapping(source = "productId", target = "id"),
            @Mapping(source = "name", target = "nombre"),
            @Mapping(source = "price", target = "precio")

    })
    /*MÉTODO QUE RECIBIRÁ UN PRODUCTO Y LO VA TRANSFORMAR A UN PRODUCTODTO*/
    ProductDTO toProductDTO(Product product);

    List<ProductDTO> toProductsDTO(List<Product> products);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "createAt", ignore = true)
    })
    Product toProduct(ProductDTO productTDO);



}
