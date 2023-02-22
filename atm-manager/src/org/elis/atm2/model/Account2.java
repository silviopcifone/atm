package org.elis.atm2.model;

import java.util.Random;

public class Account2 {

    private String Id;
    private int balance;
    AccountOwner2 accountOwner2;

    public int generatePin() {
        return new Random().nextInt(8999)+1000;
    }
    public String generateId(int initialBalance, String name) {
        return initialBalance + name;
    }

    public Account2(AccountOwner2 accountOwner2) {
        this(100, accountOwner2.getName());
        this.accountOwner2 = accountOwner2;
        this.balance = 100;

    }

    public Account2(int balance, AccountOwner2 accountOwner2) {
        this(balance, accountOwner2.getName());
        this.balance = balance;
        this.accountOwner2 = accountOwner2;
    }

    public Account2(int balance, String name) {
        this.Id = generateId(balance, name);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public String getId() {
        return Id;
    }

    public AccountOwner2 getAccountOwner2() {
        return accountOwner2;
    }

    public void setAccountOwner2(AccountOwner2 accountOwner2) {
        this.accountOwner2 = accountOwner2;
    }
}
