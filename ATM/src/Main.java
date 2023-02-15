import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double balanceAmount = 10000;
        int withdrawAmount = 0;
        double depositAmount = 0;

        System.out.println("Benvenuto");
        System.out.println("Menu \n 1: controlla bilancio \n 2: prelievo \n 3: deposito \n 4: esci");


        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Il tuo bilancio è di " + balanceAmount + " euro");
                break;
            case 2:
                System.out.println("Prelievo selezionato, quanto vuoi prelevare?");
                withdrawAmount = scanner.nextInt();
                if (withdrawAmount > balanceAmount) {
                    System.out.println("Errore, seleziona un importo valido");
                } else {
                    double differenza = balanceAmount - withdrawAmount;

                    System.out.println("Hai prelevato " + withdrawAmount + " euro, il tuo saldo rimanente è di " + differenza + " euro");
                }
                break;
            case 3:
                System.out.println("Deposito selezionato, quanto vuoi depositare?");
                depositAmount = scanner.nextInt();
                double newBalance = balanceAmount + depositAmount;
                System.out.println("Hai depositato correttamente " + depositAmount + " euro, il tuo nuovo bilancio è di " + newBalance);
                break;
            case 4:
                System.out.println("ATM in chiusura");
                scanner.close();
            default:
                System.out.println("Errore");
        }



    }
}