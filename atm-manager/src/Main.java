import sdk.model.Account;
import service.Atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account user = new Account("Raffaele", "Papaleo");
        Atm atm =new Atm(user);
        atm.printWelcome();
        atm.printMenu();

    }
}