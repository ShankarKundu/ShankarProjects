package com.example.springjpanewcurdApp.utils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CustomException extends RuntimeException{
    private int errorCode;
    private String message;
    private String problemWith;

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "errorCode=" + errorCode +
                ", message='" + message + '\'' +
                '}';
    }

    public String getProblemWith() {
        return problemWith;
    }
}
