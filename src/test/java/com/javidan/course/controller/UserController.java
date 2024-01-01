package com.javidan.course.controller;

import com.javidan.course.model.UserResponse;
import com.javidan.course.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v1/users/{username}/profile")
public class UserController {

    public  final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public UserResponse getUserName (@PathVariable String username){
        return userService.getUserName(username);
    }
}
