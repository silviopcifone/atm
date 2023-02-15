import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balanceAmount = 10000;
        int depositAmount = 0, withdrawAmount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ATM ... ");

        System.out.println("Select 1 for Withdraw");
        System.out.println("Select 2 for Deposit");
        System.out.println("Select 3 for Check Balance");
        System.out.println("Select 4 for EXIT");
        System.out.print("Select the appropriate options you want to perform: ");

        byte operation = scanner.nextByte();

    }
}