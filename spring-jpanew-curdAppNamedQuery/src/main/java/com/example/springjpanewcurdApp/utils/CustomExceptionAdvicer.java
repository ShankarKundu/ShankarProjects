package com.example.springjpanewcurdApp.utils;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionAdvicer {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ExceptionResponse> handerException(CustomException exception){
            ExceptionResponse exceptionResponse=new ExceptionResponse(exception.getErrorCode(),exception.getMessage(),exception.getProblemWith());
        return ResponseEntity.ok(exceptionResponse);

    }
}
