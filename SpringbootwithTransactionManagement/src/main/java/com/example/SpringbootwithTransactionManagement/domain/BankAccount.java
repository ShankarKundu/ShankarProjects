package com.example.SpringbootwithTransactionManagement.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@Data
@ToString
public class BankAccount {
    @Id

    private Long id;
    @Column(name = "fullname" ,nullable = false)
    private String fullname;
    @Column(name="balance",nullable = false)
    private double balance;

}
