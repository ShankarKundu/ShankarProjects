package com.example.SpringbootwithTransactionManagement.SendMoneyFrom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SendMoneyForm {
    private Long fromAccountId;
    private Long toAccountId;
    private Double amount;

}
