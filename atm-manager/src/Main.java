import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        double balance = 10000;
        int withdrawAmount = 0;
        double depositAmount = 0;
        int choice = 0;

        System.out.println("\n\nBENVENUTO!");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nSeleziona l' operazione che vuoi eseguire:\n" +
                    "1 - Controlla bilancio\n" +
                    "2 - Prelievo\n" +
                    "3 - Deposito\n" +
                    "4 - Esci\n");


            choice = scanner.nextInt();
            System.out.println("Operazione scelta:" + choice);

            switch (choice) {
                case 1:
                    System.out.println("CONTROLLA BILANCIO \n Il tuo bilancio è di: " + balance);
                    break;

                case 2:
                    System.out.println("PRELIEVO \n Quale cifra vuoi prelevare?");
                    withdrawAmount = scanner.nextInt();
                    if (balance > withdrawAmount) {
                        balance -= withdrawAmount;
                        System.out.println("\nHai prelevato: " + withdrawAmount);
                        System.out.println("\nOra il tuo bilancio è di: " + balance);
                    } else {
                        System.out.println("\nBilancio non sufficiente, prelievo non consentito ");
                    }

                    break;

                case 3:
                    System.out.println("DEPOSITO \n Quale cifra vuoi depositare?:");
                    depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    System.out.println("Hai depositato:"+depositAmount);
                    System.out.println("\nOra il tuo bilancio è di: " + balance);
                    break;

                case 4:
                    System.out.println("USCITA IN CORSO... ");
                    exit(-1);
                    break;

                default:
                    System.out.println("OPERAZIONE NON CONSENTITA");


            }
        }
    }
}