package org.atm.model;

public class Account {

    private  int ID;
    private int balance;
    private AccountOwner owner;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public Account() {
        ID = 1;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }
}
