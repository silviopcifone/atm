import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;
import org.eih.atm.service.Atm;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

//        Atm atm = new Atm();
//        AccountOwner owner = new AccountOwner("Emanuele","Valentini");
//        BankAccount ba = new BankAccount(10000,owner);
//        atm.printWelcome();
//        while(true)
//        {
//            atm.menuAtm(atm,ba);
//            byte choice = atm.printMenu();
//
//            switch (choice)
//            {
//                case 1:
//                    atm.printBalance(ba);
//                    break;
//                case 2:
//                    atm.withdraw(ba);
//                    break;
//                case 3:
//                    atm.deposit(ba);
//                    break;
//                case 4:
//                    atm.closeApp();
//                    System.exit(0);
//                default:
//                    atm.error();
//                    break;
//            }
//        }
//        public void printWelcome()
//        {
//            System.out.println("Benvenuto nell'atm");
//        }
//
//        public byte printMenu()
//        {
//            System.out.println("cosa vuoi fare? \n 1) Saldo contabile \n 2) Prelievo \n 3) Deposito \n 4) Esci");
//            System.out.println("Premi il tasto corrispondente all'operazione che vuoi effettuare");
//            byte choice = sc.nextByte();
//            return choice;
//        }
//
//        public void printBalance(BankAccount userAccount)
//        {
//            System.out.printf("Il saldo corrente è : %s", userAccount.getBalanceAmount());
//            System.out.println();
//        }
//
//        public void withdraw(BankAccount userAccount)
//        {
//            System.out.println("quanto vuoi prelevare?");
//            int amount = getAmount();
//            if(amount==0 && amount>=userAccount.getBalanceAmount())
//            {
//                System.out.println("non puoi prelevare più del saldo");
//            }
//            else
//            {
//                userAccount.setBalanceAmount(userAccount.getBalanceAmount()-amount);
//                System.out.println("il tuo nuovo saldo è: "+userAccount.getBalanceAmount());
//            }
//        }
//
//        public void deposit(BankAccount userAccount)
//        {
//            System.out.println("quanto vuoi depositare?");
//            int amount = getAmount();
//            userAccount.setBalanceAmount(userAccount.getBalanceAmount()+amount);
//            System.out.println("il tuo nuovo saldo è: "+userAccount.getBalanceAmount());
//        }
//
//        public void closeApp()
//        {
//            System.out.println("grazie per aver utilizzato l'atm");
//        }
//
//        public void error()
//        {
//            System.out.println("Errore, hai selezionato una funzionalità inesistente");
//        }
//
//        public int getAmount(){
//        return sc.nextInt();
//    }
//
//        public void menuAtm(Atm atm, BankAccount ba){
//        atm.printWelcome();
//        byte choice = atm.printMenu();
//
//        switch (choice)
//        {
//            case 1:
//                atm.printBalance(ba);
//                break;
//            case 2:
//                atm.withdraw(ba);
//                break;
//            case 3:
//                atm.deposit(ba);
//                break;
//            case 4:
//                atm.closeApp();
//                System.exit(0);
//            default:
//                atm.error();
//                break;
//        }
//    }
    }
}