package org.eih.atm.test;

import junit.framework.TestCase;
import org.eih.atm.exception.AtmOperationException;
import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;
import org.eih.atm.service.Atm;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestAtm extends TestCase {
    /*
    Atm:
    autenticare l’utente
    pin autogenerato short "4 cifre"
    abilitare deposito, prelievo e visualizzazione bilancio
    visualizzare il menù
    permettere la creazione e la modifica degli utenti
    Storico operazioni per utente: “<UtenteID> ha effettuato la seguente <operazione>”
    storico delle transazioni per utente: invece di operazione hai il valore +se deposito -se prelevo
     */
    BankAccount ba;
    AccountOwner ao;
    Atm atm;

    @Override
    protected void setUp() throws Exception{
        super.setUp();
        atm = new Atm();
        ao = new AccountOwner("Emanuele","Valentini",25);
        ba = new BankAccount(10000, ao);
        ao.setBankAccount(ba);
        atm.setBankAccount(ba.getID(),ba);
    }

    @Test
    public void testCheckBalance(){
        int actualBalance = atm.getBalance();
        int expectedBalance = 10000;
        assertEquals(expectedBalance,actualBalance);
    }

    @Test
    public void testDeposit(){
        atm.deposit(1000);
        int expectedBalance = 11000;
        assertEquals(expectedBalance,atm.getBalance());
    }

    @Test
    public void testWithdraw() throws AtmOperationException {
        atm.withdraw(1000);
        int expectedBalance = 9000;
        assertEquals(expectedBalance,atm.getBalance());
    }


    @Test
    public void testMenu(){
        String expectedMenu = "cosa vuoi fare? \n 1) Saldo contabile \n 2) Prelievo \n 3) Deposito \n 4) Esci " +
                "\n Premi il tasto corrispondente all'operazione che vuoi effettuare";
        assertEquals(expectedMenu,atm.generateMenu());
    }

    @Test
    public void testWelcome(){
        String expectedWelcome = "Benvenuto nell'atm";
        assertEquals(expectedWelcome,atm.getWelcome());
    }

    @Test
    public void testcreateUser(){
        String name = "Valerio";
        String surname = "Noce";
        int age = 25;
        AccountOwner ao1 = new AccountOwner(name,surname,age);
        BankAccount ba1 = new BankAccount(ao1);
        ao1.setBankAccount(ba1);
        atm.setBankAccount(ba1.getID(),ba1);
        String expectedName = "Valerio";
        String expectedSurname = "Noce";
        int expectedAge = 25;
        assertEquals(expectedName,atm.getBankAccount().get(1).getOwner().getName());
        assertEquals(expectedSurname,atm.getBankAccount().get(1).getOwner().getSurname());
        assertEquals(expectedAge,atm.getBankAccount().get(1).getOwner().getAge());
    }

    @Test
    public void testupdateUser(){
        String name = "Valerio";
        String surname = "Noce";
        int age = 25;
        AccountOwner ao1 = new AccountOwner(name,surname,age);
        BankAccount ba1 = new BankAccount(ao1);
        ao1.setBankAccount(ba1);
        atm.setBankAccount(ba1.getID(),ba1);
        atm.getBankAccount().get(1).getOwner().setName("Vale");
        atm.getBankAccount().get(1).getOwner().setSurname("Nocino");
        atm.getBankAccount().get(1).getOwner().setAge(28);
        String expectedName = "Vale";
        String expectedSurname = "Nocino";
        int expectedAge = 28;
        assertEquals(expectedName,atm.getBankAccount().get(1).getOwner().getName());
        assertEquals(expectedSurname,atm.getBankAccount().get(1).getOwner().getSurname());
        assertEquals(expectedAge,atm.getBankAccount().get(1).getOwner().getAge());
    }

    @Test
    public void testStoricoOperazioni(){
        List<String> expectedOperations = new ArrayList<>();
        expectedOperations.add("50Valentini Ha effettuato un Prelievo");
        expectedOperations.add("50Valentini Ha effettuato un Prelievo");
        expectedOperations.add("50Valentini Ha effettuato un Deposito");
        expectedOperations.add("50Valentini Ha effettuato un controllo del saldo");
        atm.withdraw(10);
        atm.withdraw(100);
        atm.deposit(100);
        atm.getBalance();
        atm.addOperation("50Valentini",atm.getOperations());
        assertEquals(expectedOperations,atm.getOperations());
    }

    @Test
    public void testStoricoTransazioni(){
        List<Integer> expectedTransactions = new ArrayList<>();
        expectedTransactions.add(-3000);
        expectedTransactions.add(2000);
        atm.withdraw(3000);
        atm.deposit(2000);
        assertEquals(expectedTransactions,atm.getTransactions());
    }
}
