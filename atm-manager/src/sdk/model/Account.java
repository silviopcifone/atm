package sdk.model;

public class Account extends User {

    private final int ID;
    private int balance = 10000;

    private AccountOwner owner;

    public Account(String name, String surname) {
        super(name, surname);
        ID = 1;
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
