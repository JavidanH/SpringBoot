package com.javidan.course.model;

public class CustomerResponse {

    private String customerName;

    public CustomerResponse(String customerId) {
        this.customerName = customerId;
    }

    public CustomerResponse() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
