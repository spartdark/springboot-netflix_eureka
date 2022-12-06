package com.vsaldivarm.demo.clients;

import com.vsaldivarm.demo.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
//spring.application.name, url del servidor
@FeignClient(name = "product-service", url = "localhost:8001")
public interface ProductClientRest {
    //implementacion de nuestro cliente rest

    @GetMapping("/getProducts")
    public List<Product> list();

    @GetMapping("/getProduct/{id}")
    public  Product detail(@PathVariable Long id);
}
