package com.example.demo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface Bank {


    public void creatUsers(BankAccount user);
    public ArrayList<BankAccount> getUsers();
    public void updateUsers();
    public void deleteUsers();



}