package sdk.model;

public class BankAccount {
    private String ID;

    private int balanceAmount;

    private AccountOwner owner;

    public BankAccount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
    public BankAccount() {
        this.balanceAmount = 100;
    }
    public BankAccount(int balanceAmount, AccountOwner owner) {
        setBalanceAmount(balanceAmount);
        this.ID = balanceAmount + owner.getName();
    }

    public String getID() {
        return ID;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(int balanceAmount)
    {
        if(balanceAmount == 0){
            this.balanceAmount = 100;

        }else{
            this.balanceAmount = balanceAmount;
        }
    }
}
