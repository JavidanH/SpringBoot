package com.javidan.course.model;

public class UserResponse {

    private String name;

    public UserResponse(String name) {
        this.name = name;
    }


    public UserResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
