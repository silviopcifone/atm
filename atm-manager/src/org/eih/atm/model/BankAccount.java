package org.eih.atm.model;

public class BankAccount
{
    private int ID;
    private double balanceAmount;
    private AccountOwner owner;

    public BankAccount(int initialBalance) {
        this.balanceAmount=initialBalance;
    }


    public double getBalanceAmount()
    {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
}
