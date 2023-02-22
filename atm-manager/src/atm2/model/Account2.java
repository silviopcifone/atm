package atm2.model;

import java.util.Random;

public class Account2 {
    private int initialBalance;
    AccountOwner2 owner;
    private String Id;
    private int pin;
    public Account2(AccountOwner2 owner) {
        this.owner = owner;

        this.initialBalance = 100;

    }
    public Account2(int initialBalance, AccountOwner2 owner) {
        this.initialBalance = initialBalance;
        this.owner = owner;
    }
    public Account2(int initialBalance, AccountOwner2 owner, int pin) {
        this.initialBalance = initialBalance;
        this.owner = owner;
        this.pin = pin;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public AccountOwner2 getOwner() {
        return owner;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setOwner(AccountOwner2 owner) {
        this.owner = owner;
    }
    public String getGeneratedID(){
        return getInitialBalance() + getOwner().getName();
    }

    public int generatePin() {

        return this.pin = new Random().nextInt(8999) + 1000;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account2 account = (Account2) o;
        return initialBalance == account.initialBalance && pin == account.pin && owner.equals(account.owner) && Id.equals(account.Id);
    }

    public void addToBalance(int money) {
        this.initialBalance += money;
    }

    public void removeToBalance(int money) {
        this.initialBalance -= money;
    }
/*
    @Override
    public int hashCode() {
        return Objects.hash(initialBalance, owner, Id, pin);
    }
*/
}
