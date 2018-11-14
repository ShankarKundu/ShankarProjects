package com.example.crudoperation.util.customException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ExceptionAdviser {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ExceptionResponse> handler(CustomException c){

      return new ResponseEntity<>(new ExceptionResponse(400,c.getMsg()),HttpStatus.BAD_REQUEST);

    }
}
