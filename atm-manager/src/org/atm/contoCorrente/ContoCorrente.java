package org.atm.contoCorrente;

import javax.xml.namespace.QName;

public class ContoCorrente {

    private String ID;
    private int balance = 100;
    private String name;
    private String surname;

    private String username;
    private int eta;

    public ContoCorrente(int balance, String name) {
        this.balance = balance;
        this.name = name;
        this.ID= balance+name;
    }

    public ContoCorrente(String name) {
        this.name = name;
        this.ID= balance+name;
    }

    public ContoCorrente(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.username=name+surname;
        this.ID=0+surname;
    }

    public ContoCorrente(String name, String surname, int eta) {
        this.name = name;
        this.surname = surname;
        this.eta = eta;
        this.username=name+surname+eta;
        this.ID=eta*2+surname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
