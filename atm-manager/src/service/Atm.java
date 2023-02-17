package service;

import sdk.model.Account;

public class Atm {
    /**
     *
     */
    private Account userAccount;

    public Atm(Account userAccount) {

        this.userAccount = userAccount;
    }

    public void printWelcome() {
        System.out.println("Welcome");
    }

    public void printMenu() {
        System.out.println("Menu \n 1: Controlla bilancio \n ");
    }

    public void printBalance() {
        System.out.println("Your balance is" + userAccount.getBalance());
    }

    public void withdraw(int amount) {
        System.out.println("quanto vuoi prelevare?");
        if (amount < userAccount.getBalance()) {

            userAccount.setBalance(userAccount.getBalance() - amount);
            printBalance();
        } else {
            System.out.println("Credito insufficiente");
        }
    }

    public void deposit(int amount) {
        System.out.println("Quanto vuoi depositare?");
        userAccount.setBalance(userAccount.getBalance() + amount);

    }

    public void closeApp() {
    System.exit(0);
    }
}
