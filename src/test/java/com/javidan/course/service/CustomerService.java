package com.javidan.course.service;

import com.javidan.course.model.CustomerResponse;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public CustomerResponse getCustomer(String customerName){
        return new CustomerResponse(customerName);
    }
}
