package com.eih.atm.model;

public class BankAccount {
    private final int ID;
    private double balanceAmount;
    private BankAccountOwner owner;

    public BankAccount() {
        ID = 1;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount += balanceAmount;
    }
}
