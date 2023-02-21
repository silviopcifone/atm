package org.eih.atm.model;

import java.util.Random;

public class AccountOwner extends User
{
    private String username;
    private String ID;

    private short pin;

    public AccountOwner(String name, String surname){
        super(name, surname);
        this.username = name + surname;
        this.ID = 0+surname;
        this.pin = 1234;
    }

    public AccountOwner(String name, String surname, int age) {
        super(name,surname,age);
        this.username = name + surname + age;
        this.ID = age * 2 + surname;
        this.pin = 1234;
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

    public short getPin() {
        return pin;
    }

}
