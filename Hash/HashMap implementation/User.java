package com.mo;

/**
 * Created by Mohammed M Khan on 1/11/2017.
 */
public class User {

    private String userName;
    private String password;
    private double balance;
    public  User(String userName){
        this.userName=userName;
    }
    public User(String userName,String password,Double balance) {
        this.userName=userName;
        this.password=password;
        this.balance=balance;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }

    public double getBalance(){
        return this.balance;
    }

    public double Deposit(double x){
        this.balance=this.balance+x;
        return this.balance;
    }

    private void setUserName(String userName){
        this.userName=userName;
    }
}
