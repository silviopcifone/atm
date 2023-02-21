package service;

import sdk.model.Account;

import java.util.Scanner;

public class Atm {
    Account userAccount;

    public Atm(Account userAccount) {
        super();
        this.userAccount = userAccount;
    }

    public void printWelcome() {
        System.out.println("Benvenuto nell'(fr)ATM" + userAccount.getName() + " " + userAccount.getSurname());
    }

    public void printMenu() {
        int amount = 0;
        byte scelta;
        boolean in_corso = true;
        Scanner in = new Scanner(System.in);

        while (in_corso == true) {
            System.out.println("Scegli un opzione: \n 1 Balance \n 2 Whithdraw \n 3 Deposit \n 4 Exit");
            System.out.print("Inserisci la tua scelta: ");
            switch (scelta = in.nextByte()) {
                case 1:
                    printBalance();
                    break;
                case 2:
                    System.out.print("Inserisci quanto vuoi prelevare: ");
                    amount = in.nextInt();
                    withdraw(amount);
                    break;
                case 3:
                    System.out.print("Inserisci quanto vuoi depositare: ");
                    amount = in.nextInt();
                    deposit(amount);
                    break;
                case 4:
                    in_corso = false;
                    break;
                default:
                    System.out.println("Non hai selezionato la scelta giusta");
                    break;
            }
        }
    }

    public void printBalance() {
        System.out.println("\nConto corrente: " + userAccount.getBalance() + "\n");
    }

    public void withdraw(int amount) {
        if (amount <= userAccount.getBalance()) {
            userAccount.setBalance(userAccount.getBalance() - amount);
            printBalance();
        } else {
            System.out.println("\n" + "Credito Insufficente.\n");
        }
    }

    public void deposit(int amount) {
        userAccount.addBalance(amount);
        printBalance();
    }
}