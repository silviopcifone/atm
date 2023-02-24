package atm2.test;
import atm2.model.Account2;
import atm2.model.Atm2;
import org.junit.Test;
import atm2.model.AccountOwner2;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestAtm {

//    @Test
//    public void authenticationUser(){
//        // dove va? ATM
//        // di cosa abbiamo bisogno? username e pin?
//        // istanziare un owner
//        /*
//        String name = "lorenzo";
//        String surname= "uddin";
//        byte age = 15;
//        int initalBalance = 2000;
//        int pin = 1234;
//        /*
//        AccountOwner2 owner = new AccountOwner2(name, surname, age);
//        Account2 account = new Account2(initalBalance, owner);
//        */
//
////        1 - identificare id conto, autenticazione : pin + username + idconto
////        2 - salvare il conto corrente sul quale vengono effettuate le operazioni
////        3 - se sei admin non è necessario l' id del conto
////        4 - logout
//
//        // TODO fare l' autenticazione
//        String userName = "Chiara1";
//        int pin = 1245;
//        String idConto = "20Chiara";
//
//
//        Atm2 atm = new Atm2(userName, pin);
//        assertTrue(atm.authenticate(userName, pin));
//
//
//    }

    @Test
    public void testAuthorizeDeposit(){
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
    public void testAuthorizeWithdraw(){
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
    public void testAuthorizeBalance(){
        int balance = 1000;
        Account2 account = new Account2(balance, new AccountOwner2("lorenzo", "matta"));
        Atm2 atm = new Atm2(account);
        //balance
        int expectedBalance = 1000;
        assertEquals(expectedBalance, atm.getBalance());
    }
    @Test
    public void testVisualizeMenu(){

        Atm2 atm = new Atm2("silvio",1245);
        String expectedResult = "Choose one of these options:\n1.balance\n2.deposit\n3.withdraw\n4.exit";
        assertEquals(expectedResult, atm.getMenu());

    }

    @Test
    public void testCreationUser(){
        /*
        1) Chi si occupa di questa funzione? non l' atm, ma in account Owner
        2) Di cosa abbiamo bisogno in input ? nome, cognome, eta
        3) Chi implementa questa funzionalità ? costruttore
        4) Cosa ci aspettiamo come risultato? l' utente coi rispettivi dati
        5) ASSERTION
    */
    }
    @Test
    public void testEditUser(){
        /*
        1) Chi si occupa di questa funzione? non l' atm, ma in account Owner
        2) Di cosa abbiamo bisogno in input ? owner, nome, cognome, eta
        3) Chi implementa questa funzionalità ? metodo che andrà a riassegnare i campi
        4) Cosa ci aspettiamo come risultato? l' utente coi rispettivi nuovi dati
        5) ASSERTION
*/
    }

    @Test
    public void testOperationSet(){
        byte age = 18;
        Account2 account = new Account2(new AccountOwner2("chiara", "uddin", age));
        Atm2 atm = new Atm2(account);

        int money = 200;
        atm.deposit(money);

        int money1 = 400;
        atm.deposit(money1);

        int money2 = 100;
        atm.withdraw(money2);

        List<String> expectedList = new ArrayList<>();

        expectedList.add(account.getOwner().getId() + "ha effettuato un deposito");
        expectedList.add(account.getOwner().getId() + "ha effettuato un deposito");
        expectedList.add(account.getOwner().getId() + "ha effettuato un prelievo");

        assertEquals(expectedList, atm.getActualList());
    }

    @Test
    public void testOperationValue(){
        byte age = 18;
        Account2 account = new Account2(new AccountOwner2("chiara", "uddin", age));
        Atm2 atm = new Atm2(account);

        int money = 200;
        atm.deposit(money);

        int money1 = 400;
        atm.deposit(money1);

        int money2 = 100;
        atm.withdraw(money2);

        List<String> expectedList = new ArrayList<>();

        expectedList.add("+200");
        expectedList.add("+400");
        expectedList.add("-100");

        assertEquals(expectedList, atm.getActualListOfValues());
    }

}

/*

1 - identificare id conto, autenticazione : pin + username + idconto
2 - salvare il conto corrente sul quale vengono effettuate le operazioni
3 - se sei admin non è necessario l' id del conto
4 - logout


 */