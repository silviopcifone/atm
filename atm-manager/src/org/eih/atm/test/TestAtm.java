package org.eih.atm.test;

import junit.framework.TestCase;
import org.eih.atm.exception.AtmOperationException;
import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;
import org.eih.atm.service.Atm;
import org.junit.Test;
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
        atm.setBankAccount(ba);
    }


    @Test
    public void testAuthentication(){
        boolean isLoggedIn = atm.authenticate(ao.getUsername(),ba.getPin());
        boolean expectedResult = true;
        assertEquals(expectedResult, isLoggedIn);
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

//    @Test
//    public void testWithdrawalError() throws AtmOperationException {
//        try{
//            assertThrows(AtmOperationException, atm.withdraw(11000));
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }
//    }

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
}
