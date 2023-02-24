import service.Atm;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        boolean ancora = true;
        Atm atm = new Atm();
        Scanner input = new Scanner(System.in);

        atm.printWelcome();
        do {
            atm.printMenu();
            byte opzione = input.nextByte();
            switch (opzione) {
                case 1:
                    atm.printBalance();
                    ancora = false;
                    break;
                case 2:
                    System.out.print("Inserire cifra da prelevare: ");
                    int amount = input.nextInt();
                    atm.withdraw(amount);
                    ancora = false;
                    break;
                case 3:
                    System.out.print("Inserire cifra da depositare: ");
                    amount = input.nextInt();
                    atm.deposit(amount);
                    ancora = false;
                    break;
                case 4:
                    atm.closeApp();
                    ancora = false;
                    break;
                default:
                    System.out.println("Errore, ritorno al menù principale.");
            }
        } while (ancora);
    }
}
