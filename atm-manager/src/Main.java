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
        

        }
    }
}