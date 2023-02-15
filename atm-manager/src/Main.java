import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 10000;
        double depositAmount = 0;
        int withdrawAmount = 0;

        System.out.println("Benvenuto in ATM");

        boolean operationCompleted = false;
        while(!operationCompleted){
            System.out.println("Scegli l' operazione \n" + "1 --> Controlla bilancio\n" + "2 --> Prelievo\n" +
                            "3 --> Deposita\n" + "4 --> Esci\n");
            Scanner sc = new Scanner(System.in);
            byte userChoice = sc.nextByte();
            System.out.println("Hai scelto l' operazione: " + userChoice);

            switch (userChoice){
                case 1:
                    System.out.println("Il bilancio residuo è: " + balance);
                    break;
                case 2:
                    System.out.println("quanto vuoi prelevare?: ");
                    break;
                case 3:
                    System.out.println("Il bilancio residuo è: 1");
                    break;
                case 4:
                    System.out.println("Il bilancio residuo è: 2");
                    break;
                default:
                    System.out.println("ritenta!");
            }
        }

    }
}