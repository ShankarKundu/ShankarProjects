package com.example.SpringbootwithTransactionManagement.BankDao;

import com.example.SpringbootwithTransactionManagement.CustomException.ValueNotFoundException;
import com.example.SpringbootwithTransactionManagement.Repositary.BankRepositary;
import com.example.SpringbootwithTransactionManagement.CustomException.BankTransactionException;
import com.example.SpringbootwithTransactionManagement.SendMoneyFrom.SendMoneyForm;
import com.example.SpringbootwithTransactionManagement.domain.BankAccount;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public class BankAccountDao {

    @Autowired
    BankRepositary bankRepositary;



    public BankAccount findById(Long id){

        Optional<BankAccount> optional =bankRepositary.findById(id);
        if(optional.isPresent()){
            System.out.println(optional.get());
            return optional.get();

             }
             return null;

    }

    public List<BankAccount> listBankAccount(){
    return bankRepositary.findAll();

    }
    @Transactional(propagation = Propagation.MANDATORY)
    public String addAmount(Long id,double amount){
       BankAccount account=this.findById(id);
       if(account==null){
           throw new ValueNotFoundException(420,"Account does't exists");
       }
       double newBalance=account.getBalance()+amount;


       if(account.getBalance()+amount<0 ){
           throw new BankTransactionException(400,
                   "The money in the account '" + id + "' is not enough (" + account.getBalance() + ")");

       }
       account.setBalance(newBalance);
       bankRepositary.save(account);
       return "ok";
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = BankTransactionException.class)
    public String sendMoney(SendMoneyForm send) throws InterruptedException {
       String first= addAmount(send.getToAccountId(),send.getAmount());
       Thread.sleep(10000);

       String second=addAmount(send.getFromAccountId(),-send.getAmount());
    if(first!=null&&second!=null){
        return "successfully";
    }
    else
        return null;
    }

}
