package org.eih.atm.model;

public class AtmTransaction
{
    private double depositAmount;
    private int withdrawalAmount;

    public int getWithdrawalAmount()
    {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getDepositAmount()
    {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount)
    {
        this.depositAmount = depositAmount;
    }
}
