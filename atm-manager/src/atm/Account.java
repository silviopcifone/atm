package atm;

public class Account {
    private final int ID;

    public Account() {
        ID =   1;
    }

    private int balance;
    private AccountOwner owner;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }
}
