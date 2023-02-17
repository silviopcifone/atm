package sdk.model;

public class Account extends User {

    private  int ID;
    private int balance;

    private AccountOwner owner;

    public Account(String name, String surname) {
        super(name, surname);
        ID = 1;
    }

    public Account(int initialBalance) {

        this.balance = initialBalance;

    }

    @Override
    public int getID() {
        return ID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
