package service;

import sdk.model.BankAccount;

import java.util.Scanner;

public class Atm {
    private BankAccount userAccount;

    public void printWelcome(){
        System.out.println("Benvenuto in ATM");
    }
    Scanner sc = new Scanner(System.in);
    public byte menu(){
        System.out.println("Scegli l' operazione \n"
                + "1 --> Controlla bilancio\n"
                + "2 --> Prelievo\n"
                + "3 --> Deposita\n"
                + "4 --> Esci\n");
        byte choice = sc.nextByte();
        return choice;
    }
    public int getAmount(){
        System.out.println("quanto vuoi prelevare?: ");
        return sc.nextInt();
    }
    public void printBalance(BankAccount userAccount){
        System.out.println("Il bilancio residuo è: " + userAccount.getBalanceAmount());
    }
    public void withdraw(BankAccount userAccount){
        int amount = getAmount();
        if(amount==0 && amount>=userAccount.getBalanceAmount()){
            System.out.println("inserisci un importo valido");
        }else {
            userAccount.setBalanceAmount(userAccount.getBalanceAmount() - amount);
            System.out.println(userAccount.getBalanceAmount());
        }
    }
    public void deposit(BankAccount userAccount){
        int amount = getAmount();
        userAccount.setBalanceAmount(userAccount.getBalanceAmount() + amount);
        System.out.println(userAccount.getBalanceAmount());
    }

    public void exit(){

    }
}
