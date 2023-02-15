import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double balance = 10000;
       int withdrawAmount = 0;
       double depositAmount = 0;
       int choice = 0;
        System.out.println("Benvenuto!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleziona l' operazione che vuoi eseguire:\n" +
                            "1 - Controlla bilancio\n" +
                            "2 - Prelievo\n" +
                            "3 - Deposito\n" +
                            "4 - Esci\n");


        choice = scanner.nextInt();
        System.out.println("Operazione scelta:"+ choice);

        switch(choice){
            case 1: System.out.println("CONTROLLA BILANCIO \n Il tuo bilancio è di: "+ balance);
                    break;

            case 2: System.out.println("PRELIEVO \n Quale cifra vuoi prelevare?");
                    withdrawAmount = scanner.nextInt();
                    break;

            case 3: System.out.println("DEPOSITO \n Quale cifra vuoi depositare?:");
                    depositAmount = scanner.nextInt();
                    break;

            case 4: System.out.println("USCITA IN CORSO... ");
                    break;

            default:System.out.println("OPZIONE NON CONSENTITA");



        }
    }
}