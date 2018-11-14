package com.example.SpringbootwithTransactionManagement.CustomException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BankTransactionException extends RuntimeException {

    private int errorCode;
    private String message;
}
