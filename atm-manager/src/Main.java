import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 0;
        int prelievo = 0;
        double deposito = 0;
        System.out.println("Benvenuto! Seleziona una delle voci dell'ATM");
        System.out.println("1. Saldo disponibile");
        System.out.println("2. Prelievo");
        System.out.println("3. Deposito");
        System.out.println("Inserire il numero dell'operazione da eseguire: ");
        byte opzione = input.nextByte();
    }
}