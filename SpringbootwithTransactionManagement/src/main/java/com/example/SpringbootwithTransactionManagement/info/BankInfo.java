package com.example.SpringbootwithTransactionManagement.info;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BankInfo {
    private Long id;
    private String fullname;
    private double balance;
}
