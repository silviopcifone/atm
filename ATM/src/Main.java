import org.elis.atm.Atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double balanceAmount = 10000;
        int withdrawAmount = 0;
        double depositAmount = 0;

        System.out.println("Benvenuto");
        System.out.println("Menu \n 1: controlla bilancio \n 2: prelievo \n 3: deposito \n 4: esci");

        Atm atm = new Atm(10000, 0, 0);
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        while (input != 4) {


            System.out.println("Menu \n 1: controlla bilancio \n 2: prelievo \n 3: deposito \n 4: esci");

            switch (input) {

                case 1:
                    System.out.println("Il tuo bilancio è di " + balanceAmount + " euro");
                    input = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Prelievo selezionato, quanto vuoi prelevare?");
                    withdrawAmount = scanner.nextInt();
                    if (withdrawAmount > balanceAmount) {
                        System.out.println("Errore, seleziona un importo valido");
                    } else {
                        balanceAmount -= withdrawAmount;

                        System.out.println("Hai prelevato " + withdrawAmount + " euro, il tuo saldo rimanente è di " + balanceAmount + " euro");
                    }
                    input = scanner.nextInt();

                    break;
                case 3:
                    System.out.println("Deposito selezionato, quanto vuoi depositare?");
                    depositAmount = scanner.nextInt();
                    balanceAmount += depositAmount;
                    System.out.println("Hai depositato correttamente " + depositAmount + " euro, il tuo nuovo bilancio è di " + balanceAmount);
                    input = scanner.nextInt();

                    break;
                case 4:
                    System.out.println("ATM.ATM in chiusura");


                default:
                    System.out.println("Errore");
            }


        }
    }
}