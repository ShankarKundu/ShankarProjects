package com.example.SpringbootwithTransactionManagement.CustomException;

import com.example.SpringbootwithTransactionManagement.domain.BankAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
@AllArgsConstructor
@Data
public class ValueNotFoundException extends RuntimeException {
    private int errorCode;
    private String message;



}
