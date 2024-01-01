package com.javidan.course.model;

public class ProductsResponse {

    private String name;


    public ProductsResponse(String name) {
        this.name = name;
    }

    public ProductsResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
