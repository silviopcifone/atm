package service;
import com.eih.atm.model.Account;

public class Atm {
    double x;
    Account account1 = new Account();
    public void printWelcome() {
        System.out.println("Benvenuto!");
    }
    public void printMenu() {
        System.out.println("1. Saldo disponibile");
        System.out.println("2. Prelievo");
        System.out.println("3. Deposito");
        System.out.println("4. Esci");
        System.out.print("Inserire opzione desiderata: ");
    }
    public void printBalance() {
        System.out.println("Il tuo saldo attuale è " + account1.getBalanceAmount() + ".");
    }
    public void withdraw(int amount) {
        if (amount<account1.getBalanceAmount()) {
            System.out.println("Hai prelevato " + amount + "€.");
            x = account1.getBalanceAmount() - amount;
            System.out.println("Il tuo saldo attuale è " + x + ".");
        } else {
            System.out.println("Somma non disponibile.");
        }
    }
    public void deposit(int amount) {
        System.out.println("Hai depositato " + amount + ".");
        x = account1.getBalanceAmount() + amount;
    }
    public void closeApp() {
        System.out.println("Grazie ed arrivederci!");
        System.exit(0);
    }
}
