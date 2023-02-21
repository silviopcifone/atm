package org.elis.atm;

import org.elis.atm.service.Atm;

import java.util.Scanner;

public class MainSecondo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Atm atm = new Atm();
        atm.printWelcome();

        while (true) {

            atm.printMenu();
            byte operation = scanner.nextByte();

            switch (operation) {
                case 1:
                    atm.printBalance();
                    break;
                case 2:
                    System.out.println("inserisci la civra da prelevare");
                    atm.withdraw(scanner.nextInt());
                    atm.printBalance();
                    break;
                case 3:
                    System.out.println("inserissci la cifra da depositare");
                    atm.deposit(scanner.nextInt());
                    atm.printBalance();
                    break;
                case 4:
                    atm.closeApp();
                    break;
                default:
                    atm.error();
            }
        }
    }
}
