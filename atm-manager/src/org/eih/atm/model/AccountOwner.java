package org.eih.atm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountOwner extends User {
    private String username;
    private String ID;
    private int pin;

    private List<BankAccount> bankAccounts;


    public AccountOwner(String name, String surname) {
        super(name, surname);
        this.username = name + surname;
        this.ID = 0 + surname;
        bankAccounts = new ArrayList<>();
    }

    public AccountOwner(String name, String surname, int age) {
        super(name, surname, age);

        this.username = name + surname + age;
        this.ID = age * 2 + surname;
        bankAccounts = new ArrayList<>();
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

    public int getPin() {
        return pin;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        }
        AccountOwner owner = (AccountOwner) obj;
        return  owner.getName() == this.getName() &&
                owner.getSurname() == this.getSurname() &&
                owner.getID() == this.getID() &&
                owner.username == this.getUsername();
    }

    public List<BankAccount> getBankAccount() {
        return bankAccounts;
    }

    public void setBankAccount(BankAccount ba) {
        this.bankAccounts.add(ba);
    }
}
