package atm2.model;

import java.util.ArrayList;
import java.util.List;

public class Atm2 {
    private String userName;
    private int pin;
    Account2 account;

    List<String> listOfOperations = new ArrayList<>();
    List<String> listOfValues = new ArrayList<>();

    public Atm2(Account2 account) {
        this.account = account;
    }
    public Atm2(String userName, int pin) {
        setUserName(userName);
        setPin(pin);
        this.pin = pin;
    }

    public  boolean authenticate(String userName, int pin) {
        boolean result = false;
        if (userName == this.userName && pin == this.pin){
            result = true;
        }
        return result;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return account.getInitialBalance();
    }


    public void deposit(int money) {
        listOfOperations.add(account.getOwner().getId() + "ha effettuato un deposito");
        listOfValues.add("+" + money);
        this.account.addToBalance(money);
    }

    public void withdraw(int money) {
        listOfOperations.add(account.getOwner().getId() + "ha effettuato un prelievo");
        account.getInitialBalance();
        listOfValues.add("-" + money);
        this.account.removeToBalance(money);
    }

    public String getMenu() {
        return "Choose one of these options:\n1.balance\n2.deposit\n3.withdraw\n4.exit";
    }

    public List<String> getActualList() {
        return listOfOperations;
    }

    public List<String> getActualListOfValues() {
        return listOfValues;
    }
}
