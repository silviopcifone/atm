package sdk.model;

import sdk.model.AccountOwner;

public class Account extends User {

    private final int ID;
    private int balance;

    private AccountOwner owner;

    public Account(String name, String surname) {
        super(name, surname);
        ID = 1;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }



}
