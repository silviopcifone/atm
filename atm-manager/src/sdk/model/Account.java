package sdk.model;

public class Account {
     private int ID;
     private int balance;
     private AccountOwner owner;

    public Account() {
        ID = 1;
    }
    public Account(int intialBalance) {
        this.balance = intialBalance;
    }

    public int getBalance() {
         return balance;
     }
    public void setBalance(int balance) {
         this.balance = balance;
    }

}
