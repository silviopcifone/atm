package org.eih.atm.model;

public class BankAccount
{
    private String ID;
    private int balanceAmount;

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
}
