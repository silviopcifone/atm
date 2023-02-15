import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 10000, depositAmount = 0;
        int withdrawAmount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Benvenuto nell'(fr)ATM");

        System.out.println("Scegli un opzione: \n 1 Balance \n 2 Whithdraw \n 3 Deposit \n 4 Exit");


        switch (scan.nextByte()) {
            case 1:
                System.out.println("Beato te che hai tutti sti soldi " + balance);
                break;
            case 2:
                System.out.println("Inserisci l'importo da prelevare");
                break;
            case 3:

                System.out.println("Inserisci l'importo da depositare");
                break;
            case 4:
                System.out.println("Arrivederci");
                break;
            default:
                System.out.println("Non hai selezionato la scelta giusta");

        }






    }
}