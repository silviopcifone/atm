package org.elis.atm2.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AccountOwner2 {
    private String name;
    private String surname;
    private int age;
    private String Id;
    private String username;
    List<Account2> bankAccount;

    public String generateUsername() {
        if (age != 0) {
            return name + surname + age;
        } else {
            return name + surname;
        }
    }

    public String generateId() {
        return (age * 2) + surname;
    }

    public AccountOwner2(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.Id= generateId();
        this.username=generateUsername();
        bankAccount=new ArrayList<>();
    }

    public AccountOwner2(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.Id= generateId();
        this.username=generateUsername();
        bankAccount=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Account2> getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Account2 account) {
      this.bankAccount.add(account);
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        }
        AccountOwner2 owner = (AccountOwner2) obj;
        return  owner.getName() == this.getName() &&
                owner.getSurname() == this.getSurname() &&
                owner.getId() == this.getId() &&
                owner.username == this.getUsername();
    }
}
