package com.javidan.course.model;

public class MessageResponse {

    private String content;

    public MessageResponse(String content) {
        this.content = content;
    }

    public MessageResponse() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
