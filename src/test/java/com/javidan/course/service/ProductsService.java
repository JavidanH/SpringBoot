package com.javidan.course.service;


import com.javidan.course.model.ProductsResponse;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    public ProductsResponse findProducts (String name){
        return new ProductsResponse(name);
    }
}