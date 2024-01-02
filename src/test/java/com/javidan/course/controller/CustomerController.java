package com.javidan.course.controller;

import com.javidan.course.model.CustomerResponse;
import com.javidan.course.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/customers/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("{customerId}")
    public CustomerResponse getCustomer (@PathVariable String customerName){
        return customerService.getCustomer(customerName);
    }
}
