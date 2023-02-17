import sdk.model.BankAccount;
import service.Atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Atm atm = new Atm();
        BankAccount ba = new BankAccount(1);
        // Exit condition
        boolean operationCompleted = false;
        while(!operationCompleted){
            atm.printWelcome();
            byte userChoice = atm.menu();

            System.out.println("Hai scelto l' operazione: " + userChoice);

            // available operations
            switch (userChoice){
                case 1:
                    atm.printBalance(ba);
                    break;
                case 2:
                   atm.withdraw(ba);
                    break;
                case 3:
                    atm.deposit(ba);
                    break;
                case 4:
                    System.out.println("Arrivederci!");
                    operationCompleted = true;
                    break;
                default:
                    System.out.println("ritenta!");
            }
        }

    }

}