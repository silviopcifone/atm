import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double balanceAmount = 10000;
        double depositAmount = 0;
        int withdrawalAmount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Benvenuto nell'atm");
        System.out.println("cosa vuoi fare? \n 1) Saldo contabile \n 2) Prelievo \n 3) Deposito \n 4) Esci");
        System.out.println("Premi il tasto corrispondente all'operazione che vuoi effettuare");
        byte choice = sc.nextByte();

        switch (choice)
        {
            case 1:
                System.out.printf("Il saldo corrente è : %s", balanceAmount);
                break;
            case 2:
                System.out.println("quanto vuoi prelevare?");
                withdrawalAmount = sc.nextInt();
                if(withdrawalAmount>=balanceAmount)
                {
                    System.out.println("non puoi prelevare più del saldo");
                    break;
                }
                else
                {
                    balanceAmount -= withdrawalAmount;
                    System.out.println("il tuo nuovo saldo è: "+balanceAmount);
                }
                break;
            case 3:
                System.out.println("quanto vuoi depositare?");
                depositAmount = sc.nextDouble();
                balanceAmount += depositAmount;
                System.out.println("il tuo nuovo saldo è: "+balanceAmount);
                break;
            case 4:
                System.out.println("grazie per aver utilizzato l'atm");
                break;
            default:
                System.out.println("Errore, hai selezionato una funzionalità inesistente");
                break;
        }
    }
}