import org.eih.atm.model.BankAccount;
import org.eih.atm.service.Atm;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Atm atm = new Atm();
        BankAccount ba = new BankAccount(1);

        while(true)
        {
            atm.printWelcome();
            byte choice = atm.printMenu();

            switch (choice)
            {
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
                    atm.closeApp();
                    System.exit(0);
                default:
                    atm.error();
                    break;
            }
        }
    }
}