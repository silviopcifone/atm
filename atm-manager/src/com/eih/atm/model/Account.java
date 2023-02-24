package com.eih.atm.model;

public class Account {
    private final int ID;
    private double balanceAmount;
    private AccountOwner owner;

    public Account() {
        ID = 1;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount += balanceAmount;
    }
}
