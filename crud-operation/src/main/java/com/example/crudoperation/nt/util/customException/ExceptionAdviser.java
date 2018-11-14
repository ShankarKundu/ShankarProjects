package com.example.crudoperation.nt.util.customException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice

public class ExceptionAdviser {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ExceptionResponse> handler(CustomException c){

      return new ResponseEntity<>(new ExceptionResponse(400,c.getMsg()),HttpStatus.BAD_REQUEST);

    }
}
