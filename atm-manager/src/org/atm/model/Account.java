package org.atm.model;

public class Account {

    private String ID;
    private int balance;
    private AccountOwner owner;

    private int initialBalance=100;
    private String name;

    public Account() {
    }

    public Account(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Account(String name) {
        this.name = name;
        this.ID=initialBalance+name;
    }

    public Account(int initialBalance, String name) {
        this.initialBalance = initialBalance;
        this.name = name;
        this.ID=initialBalance+name;
    }



    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }
}
