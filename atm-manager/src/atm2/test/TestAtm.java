package atm2.test;
import atm2.model.Account2;
import atm2.model.Atm2;
import org.junit.Test;
import atm2.model.AccountOwner2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestAtm {

    @Test
    public void authenticationUser(){
        // dove va? ATM
        // di cosa abbiamo bisogno? username e pin?
        // istanziare un owner
        /*
        String name = "lorenzo";
        String surname= "uddin";
        byte age = 15;
        int initalBalance = 2000;
        int pin = 1234;
        /*
        AccountOwner2 owner = new AccountOwner2(name, surname, age);
        Account2 account = new Account2(initalBalance, owner);
        */

        String userName = "Chiara1";
        int pin = 1245;
        Atm2 atm = new Atm2(userName, pin);
        assertTrue(atm.authenticate(userName, pin));
    }

    @Test
    public void authorizeDeposit(){
        int balance = 1000;
        Account2 account = new Account2(balance, new AccountOwner2("lorenzo", "matta"));
        Atm2 atm = new Atm2(account);

        int moneyToAddOrWithdraw = 200;
        //deposit

        int expectedBalance = 1200;
        atm.deposit(moneyToAddOrWithdraw);
        assertEquals(expectedBalance, atm.getBalance());

    }

    @Test
    public void authorizeWithdraw(){
        int balance = 1000;
        Account2 account = new Account2(balance, new AccountOwner2("lorenzo", "matta"));
        Atm2 atm = new Atm2(account);

        int moneyToWithdraw = 200;

        //withdraw
        int expectedBalanceAfterWithdraw = 800;
        atm.withdraw(moneyToWithdraw);
        assertEquals(expectedBalanceAfterWithdraw, atm.getBalance());
    }

    @Test
    public void authorizeBalance(){
        int balance = 1000;
        Account2 account = new Account2(balance, new AccountOwner2("lorenzo", "matta"));
        Atm2 atm = new Atm2(account);
        //balance
        int expectedBalance = 1000;
        assertEquals(expectedBalance, atm.getBalance());
    }


}
