import org.eih.atm.service.Atm;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Atm atm = new Atm();

        while(true)
        {
            atm.printWelcome();
            byte choice = atm.printMenu();

            switch (choice)
            {
                case 1:
                    atm.printBalance();
                    break;
                case 2:
                    atm.withdraw();
                    break;
                case 3:
                    atm.deposit();
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