package com.javidan.course.controller;

import com.javidan.course.model.MessageResponse;
import com.javidan.course.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/messages")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public MessageResponse getMessage (String text){
       return messageService.getMessage(text);
    }
}
