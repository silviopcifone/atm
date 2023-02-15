import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 1000;
        int prelievo = 0;
        double deposito = 0;
        System.out.println("Benvenuto! Seleziona una delle voci dell'ATM");
        System.out.println("1. Saldo disponibile");
        System.out.println("2. Prelievo");
        System.out.println("3. Deposito");
        System.out.println("4. Esci");
        System.out.print("Inserire il numero dell'operazione da eseguire: ");
        byte opzione = input.nextByte();

        switch(opzione) {
            case 1:
                System.out.println("Il tuo saldo disponibile è " + saldo + "€");
                break;
            case 2:
                System.out.print("Inserire l'importo da prelevare: ");
                byte prel = input.nextByte();
                if (prel<saldo) {
                    System.out.println("Hai prelevato " + prel + "€");
                    saldo -= prel;
                    System.out.println("Il tuo saldo disponibile adesso è " + saldo + "€");
                } else {
                    System.out.println("Non puoi prelevare un'importo superiore al saldo");
                }
                break;
            case 3:
                System.out.print("Inserire l'importo da depositare");
                byte dep = input.nextByte();
                System.out.println("Hai depositato " + dep + "€");
                saldo += dep;
                System.out.println("Il tuo saldo disponibile adesso è " + saldo);
                break;
            case 4:
                System.out.println("Grazie per aver utilizzato questo ATM, arrivederci! ");
                break;
            default:
                System.out.println("Errore, inserire di nuovo il numero dell'operazione da eseguire");
                break;
        }
    }
}