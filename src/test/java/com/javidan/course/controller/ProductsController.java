package com.javidan.course.controller;

import com.javidan.course.model.ProductsResponse;
import com.javidan.course.model.UserResponse;
import com.javidan.course.service.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/products")
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public ProductsResponse findProducts (@PathVariable String name){
        return productsService.findProducts(name);
    }
}
