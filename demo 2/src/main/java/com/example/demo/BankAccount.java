package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Scanner;

@Entity
public class BankAccount {

    private static int Count = 0;

    @Id
    private int accountnumber;
    private float balance;
    private String customerName;
    private long phoneNumber;
    private String email;


    BankAccount(String customerName, int accountnumber, float balance, long phonenumber, String Email){
        this.accountnumber = accountnumber;
        this.customerName = customerName;
        this.balance = balance;
        this.phoneNumber = phonenumber;
        this.email = Email;
    }

    public BankAccount() {
        accountnumber = ++Count;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
