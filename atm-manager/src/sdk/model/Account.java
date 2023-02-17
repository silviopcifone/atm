package sdk.model;

import sdk.model.AccountOwner;

public class Account {

    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

}
