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
        System.out.println("cosa vuoi fare? \n 1) Saldo contabile \n 2) Deposito \n 3) Prelievo \n 4) Esci");
        System.out.println("Premi il tasto corrispondente all'operazione che vuoi effettuare");
        byte choice = sc.nextByte();

        
    }
}