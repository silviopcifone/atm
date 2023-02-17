package sdk.model;

public class Account extends User {

    private  String ID;
    private int balance;
    private AccountOwner owner;

    public Account(String name, String surname) {
        super(name, surname);

    }

    public Account(int initialBalance) {

        this.balance = initialBalance;

    }

    public Account(AccountOwner owner) {
        this.balance = 100;
        this.owner = owner;

    }

    public Account(int initialBalance, AccountOwner owner) {
        this.balance = initialBalance;
        this.owner = owner;
        this.ID = initialBalance + owner.getName();


    }

    @Override
    public String getID() {
        return ID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
