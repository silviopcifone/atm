package sdk.model;

import service.Atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name, surname, eta;
        System.out.println("Inserisci il nome");
        name = in.nextLine();
        System.out.println("Inserisci il cognome");
        surname = in.nextLine();
        System.out.println("Inserisci quanti sordi hai:");
        int balance = in.nextInt();
        System.out.println("Inserisci età");
        eta = in.nextLine();
        Account account = new Account(name, surname, balance, eta);
        Atm atm = new Atm(account);
        atm.printMenu();
    }
}
