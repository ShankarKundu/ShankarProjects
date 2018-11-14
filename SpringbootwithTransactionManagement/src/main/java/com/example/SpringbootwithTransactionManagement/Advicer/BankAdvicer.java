package com.example.SpringbootwithTransactionManagement.Advicer;

import com.example.SpringbootwithTransactionManagement.CustomException.BankTransactionException;
import com.example.SpringbootwithTransactionManagement.CustomException.ValueNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BankAdvicer extends RuntimeException{
    ExceptionResponse er;

    @ExceptionHandler(ValueNotFoundException.class)
    ResponseEntity<ExceptionResponse> handle(ValueNotFoundException vv){
      er=new ExceptionResponse(vv.getErrorCode(),vv.getMessage());
      return ResponseEntity.ok(er);

    }
    @ExceptionHandler(BankTransactionException.class)
    ResponseEntity<ExceptionResponse> handle(BankTransactionException vv){
        er=new ExceptionResponse(vv.getErrorCode(),vv.getMessage());
        return ResponseEntity.ok(er);

    }


}
