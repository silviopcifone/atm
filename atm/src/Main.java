import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balanceAmount = 10000  , depositAmount = 0;
        int withdrawAmount = 0;

        System.out.println("Benvenuto nel tuo conto");
        System.out.println("Digita 1: Controlla Bilancio, Digita 2: Prelievo, Digita 3: Deposito, Digita 4: Esci  ");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();

        switch (i){
            case 1:
                System.out.println("Sei nel tuo bilancio");
                break;
            case 2:
                System.out.println("Puoi prelevare");
                break;
            case 3:
                System.out.println("Puoi depositare");
                break;
            case 4:
                System.out.println("Esci dal tuo conto");
                break;
            default:
                System.out.println("Opzione non valida");
                break;

        }







    }
}