package com.example.SpringbootwithTransactionManagement.Advicer;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ExceptionResponse {
    private int errorCode;
    private String message;
}
