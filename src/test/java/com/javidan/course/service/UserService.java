package com.javidan.course.service;

import com.javidan.course.model.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserResponse getUserName(String username){

        return new UserResponse(username);
    }
}
