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

        switch (operation) {
            case 1 -> {
                System.out.print("Enter the amount to be withdrawn :");
                // accept the withdrawal amount from the user
                withdrawAmount = scanner.nextInt();
                //check whether the balance is greater than or equal to the withdrawal amount
                System.out.println("Withdrawn Operation :");
                System.out.println("The withdrawing Amount is : " + withdrawAmount);
                if (balanceAmount >= withdrawAmount) {
                    balanceAmount = balanceAmount - withdrawAmount;
                    System.out.println("Please collect your money and remove the card");
                    System.out.println(" The Current Balance : " + balanceAmount);
                    System.out.println();
                } else {
                    System.out.println("Sorry! the balance is insufficient.");
                    System.out.println();
                }
            }
            default -> System.out.println("The chosen option is incorrect. Please select one option from the following menu:");


        }
}