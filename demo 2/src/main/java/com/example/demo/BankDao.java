package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BankDao implements Bank{
ArrayList<BankAccount> users = new ArrayList<>();

    BankDao(){
        BankAccount test = new BankAccount();
        test.setCustomerName("Srijana");
        test.setBalance(500f);
        test.setEmail("sizraw@hotmail.com");
        test.setPhoneNumber(5108512770l);
        test.setAccountnumber(1);
        this.creatUsers(test);
    }

    @Override
    public void creatUsers(BankAccount user) {
        users.add(user);
    }

    @Override
    public ArrayList<BankAccount> getUsers() {
        return users;
    }

    @Override
    public void updateUsers() {

    }



    @Override
    public void deleteUsers() {

    }
}
