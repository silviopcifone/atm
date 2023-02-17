package org.eih.atm.model;

public class BankAccount
{
    private String ID;
    private double balanceAmount;

    private AccountOwner owner;

    public BankAccount(int initialBalance, AccountOwner owner) {
        this.balanceAmount = initialBalance;
        this.owner = owner;
        this.ID = initialBalance + "" + owner.getName();
    }

    public BankAccount(AccountOwner owner) {
        this.balanceAmount = 100;
        this.owner = owner;
        this.ID = this.balanceAmount + "" + owner.getName();
    }


    public double getBalanceAmount()
    {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
