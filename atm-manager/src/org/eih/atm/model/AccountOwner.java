package org.eih.atm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountOwner extends User {

    private List<BankAccount> bankAccounts;


    public AccountOwner(String name, String surname) {
        super(name, surname);
        bankAccounts = new ArrayList<>();
    }

    public AccountOwner(String name, String surname, int age) {
        super(name, surname, age);
        bankAccounts = new ArrayList<>();
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
                owner.getUsername() == this.getUsername();
    }

    public List<BankAccount> getBankAccount() {
        return bankAccounts;
    }

    public void setBankAccount(BankAccount ba) {
        this.bankAccounts.add(ba);
    }
}
