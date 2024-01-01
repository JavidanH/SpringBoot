package com.javidan.course.service;


import com.javidan.course.model.MessageResponse;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
   public MessageResponse getMessage(String text){
       return new MessageResponse(text);
   }


}
