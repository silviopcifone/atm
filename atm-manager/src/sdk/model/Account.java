package sdk.model;

import sdk.model.AccountOwner;

public class Account {

    private final int ID;
    private int balance;

    private AccountOwner owner;

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
