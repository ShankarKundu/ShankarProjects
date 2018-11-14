package com.example.SpringbootwithTransactionManagement.Repositary;

import com.example.SpringbootwithTransactionManagement.domain.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepositary extends JpaRepository<BankAccount,Long> {


}
