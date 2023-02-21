package service;
import java.util.Scanner;
import sdk.model.Account;

public class Atm {
    /**
     *
     */
    private Account userAccount;
    int withdrawAmount;
    int depositAmount;
    Scanner scanner = new Scanner(System.in);
    String username = "RaffaelePapaleo24";
    short pin = 1234;

    public Atm() {

    }

    public Atm(Account userAccount) {

        this.userAccount = userAccount;
    }

    public void printWelcome() {
        System.out.println("Welcome");
    }

    public void printMenu() {
        while(true) {
            System.out.println("Select 1 for Check Balance");
            System.out.println("Select 2 for Withdraw");
            System.out.println("Select 3 for Deposit");
            System.out.println("Select 4 for EXIT");
            System.out.print("Select the appropriate options you want to perform: ");

            byte operation = scanner.nextByte();
            switch (operation) {
                case 1:
                    printBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                   closeApp();
                    break;
                default:
                    System.out.println("The chosen option is incorrect. Please select one option from the following menu:");
            }
        }
    }

    public void printBalance() {
        System.out.println("Your balance is " + userAccount.getBalance());
    }

    public void withdraw() {
        System.out.println("quanto vuoi prelevare?");
        withdrawAmount = scanner.nextInt();
        if (withdrawAmount < userAccount.getBalance()) {

            userAccount.setBalance(userAccount.getBalance() - withdrawAmount);
            printBalance();
        } else {
            System.out.println("Credito insufficiente");
        }
    }

    public void deposit() {
        System.out.println("Quanto vuoi depositare?");
        depositAmount = scanner.nextInt();
        userAccount.setBalance(userAccount.getBalance() + depositAmount);
        printBalance();

    }

    public void closeApp() {
    System.exit(0);
    }

    public boolean authenticate(String username, short pin) {
        return this.username.equals(username) && this.pin == pin;

    }

}
