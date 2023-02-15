import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balanceAmount = 10000;
        long depositAmount = 0;
        long whitdrawAmount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto");
        String menu=("seleziona l'operazione che vuoi eseguire: \n1: BALANCE\n2: DEPOSIT\n3: WHITDRAW\n4:EXIT");
        System.out.println(menu);

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println(balanceAmount);
                break;
            case 2:
                System.out.println("inserisci la cifra che vuoi versare");
                balanceAmount += scanner.nextInt();
                depositAmount += scanner.nextInt();
                System.out.println("ti ringraziamo per il tuo deposito");
                System.out.println("il tuo deposito è di "+balanceAmount);
                break;
            case 3:
                System.out.println("inserisci la cifra da prelevare");
                whitdrawAmount= scanner.nextInt();
                if(whitdrawAmount>balanceAmount){
                    System.out.println("ipossibbile prlevare una cifra superiore a quella posseduta");
                }else {
                    balanceAmount-=whitdrawAmount;
                }
                System.out.println(balanceAmount);
            case 4:
                System.out.println("grazie e arrivederci");
                break;
            default:
                System.out.println("ERRORE");
                System.out.println("inserisi un numero tra quelli sopra citati");

        }
    }
}