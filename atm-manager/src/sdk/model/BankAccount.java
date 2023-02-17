package sdk.model;

public class BankAccount {
    private final int ID;

    private double balanceAmount;

    private AccountOwner owner;

    public BankAccount(int ID) {
        this.ID = ID;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
}
