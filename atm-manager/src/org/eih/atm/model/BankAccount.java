package org.eih.atm.model;

import java.util.Objects;
import java.util.Random;

public class BankAccount
{
    private String ID;
    private int balanceAmount;

    private AccountOwner owner;
    private final int pin;

    public BankAccount(int initialBalance, AccountOwner owner) {
        this.balanceAmount = initialBalance;
        this.owner = owner;
        this.ID = initialBalance + "" + owner.getName();
        this.pin = generatePin();
    }

    public BankAccount(AccountOwner owner) {
        this.balanceAmount = 100;
        this.owner = owner;
        this.ID = this.balanceAmount + "" + owner.getName();
        this.pin = generatePin();
    }


    public int getBalanceAmount()
    {
        return balanceAmount;
    }

    public void setBalanceAmount(int balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public AccountOwner getOwner() {
        return owner;
    }

    public void setOwner(AccountOwner owner) {
        this.owner = owner;
    }

    public int getPin() {
        return pin;
    }

    public int generatePin() {
        return new Random().nextInt(8999) + 1000;
    }

    public void addCounterToAO(){

    }
}
