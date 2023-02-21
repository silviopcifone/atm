package org.elis.atm.service;

import org.elis.atm.model.Account;

public class Atm {
    /**
     *
     */
    Account account = new Account();

    public void printWelcome() {
        System.out.println("benvenuto");
    }

    public void printMenu() {
        System.out.println("Select 1 for Check Balance");
        System.out.println("Select 2 for Withdraw");
        System.out.println("Select 3 for Deposit");
        System.out.println("Select 4 for EXIT");
    }

    public void error() {
        System.out.print("Select the appropriate options you want to perform: ");
    }

    public void printBalance() {
        System.out.println("hai un credito di: " + account.getBalance());

    }

    public void withdraw(int amount) {
        if (amount > account.getBalance()) {
            System.out.println("impossibbile prelevare cifre superiori al suo deposito");
        } else {

            System.out.println("hai prelevato " + amount);
            account.setBalance(-amount);
            // System.out.println("ora il tuo credito è di "+account.getBalance());
        }
    }

    public void deposit(int amount) {
        System.out.println("hai depositato " + amount);
        account.setBalance(+amount);
        //  System.out.println("ora il tuo credito è di "+account.getBalance());
    }

    public void closeApp() {
        System.exit(0);
    }
}
