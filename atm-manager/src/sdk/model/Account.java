package sdk.model;

public class Account extends User {
    private int balance = 100;
    private AccountOwner owner;

    public Account(String name, String surname, int balance, String eta) {
        super(name, surname);
        if (balance == 0) {
            this.balance = 100;
        } else {
            this.balance = balance;
        }
        this.ID = generate();
    }

    @Override
    public String generate() {
        ID = this.name + balance;
        return ID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addBalance(int balance) {
        this.balance += balance;
    }

}
