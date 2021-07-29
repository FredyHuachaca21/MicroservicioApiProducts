package com.killa.microapiproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.killa.microapiproducts.applications.mapper"})
//@EntityScan("com.killa.microapiproducts.applications.mapper")
public class MicroApiProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroApiProductsApplication.class, args);
    }

}
