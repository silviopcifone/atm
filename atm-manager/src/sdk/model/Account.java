package sdk.model;

import sdk.model.AccountOwner;

import java.util.Objects;
import java.util.Random;

public class Account {

    private int initialBalance;
    private AccountOwner owner;
    private String Id;
    private int pin;

    public Account(int initialBalance, AccountOwner owner) {
        this.initialBalance = initialBalance;
        this.owner = owner;
        this.pin = generatePin();
    }

    public Account(int initialBalance, AccountOwner owner, int pin) {
        this.initialBalance = initialBalance;
        this.owner = owner;
        this.pin = pin;
    }

    public Account(AccountOwner owner) {
        this.initialBalance = 100;

    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public AccountOwner getOwner() {
        return owner;
    }

    public void setOwner(AccountOwner owner) {
        this.owner = owner;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String generateId(int initialBalance, String ownerName) {

        return this.Id = initialBalance + ownerName;

    }

    public int getPin() {
        return pin;
    }

    public int generatePin() {

        return this.pin = new Random().nextInt(8999) + 1000;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return initialBalance == account.initialBalance && pin == account.pin && owner.equals(account.owner) && Id.equals(account.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initialBalance, owner, Id, pin);
    }
}
