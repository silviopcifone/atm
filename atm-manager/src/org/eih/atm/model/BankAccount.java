package org.eih.atm.model;

public class BankAccount
{
    private final int ID;
    private double balanceAmount = 10000;
    private AccountOwner owner;

    public BankAccount(int id)
    {
        ID = id;
    }

    public double getBalanceAmount()
    {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount += balanceAmount;
    }
}
