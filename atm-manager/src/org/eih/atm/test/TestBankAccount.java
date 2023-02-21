package org.eih.atm.test;

import junit.framework.TestCase;
import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestBankAccount extends TestCase {
    BankAccount ba;
    AccountOwner ao;
    @Override
    protected void setUp() throws Exception{
        super.setUp();
        ao = new AccountOwner("Emanuele","Valentini",25);
        ba = new BankAccount(10000, ao);
    }
    @Test
    public void testCreateBankAccount(){
        String name = "Emanuele";
        String surname = "Valentini";
        AccountOwner owner = new AccountOwner(name,surname);
        int initialBalance = 5000;
        BankAccount bankAccount = new BankAccount(initialBalance,owner);
        int expectedBalance = initialBalance;
        assertEquals(this.ao,bankAccount.getOwner());
    }

    @Test
    public void testCreateBankAccountNoBalance(){
        String name = "Emanuele";
        String surname = "Valentini";
        AccountOwner owner = new AccountOwner(name,surname);
        int initialBalance = 100;
        BankAccount bankAccount = new BankAccount(owner);
        int expectedBalance = initialBalance;
        assertEquals(expectedBalance, bankAccount.getBalanceAmount());
    }

    @Test
    public void testIDBankAccountNoBalance(){
        String name = "Emanuele";
        String surname = "Valentini";
        AccountOwner owner = new AccountOwner(name,surname);
        BankAccount bankAccount = new BankAccount(owner);
        String ID = bankAccount.getID();
        String expectedID = "100Emanuele";
        assertEquals(expectedID,ID);
    }

    @Test
    public void testIDBankAccountBalance(){
        String name = "Emanuele";
        String surname = "Valentini";
        int initialBalance = 5000;
        AccountOwner owner = new AccountOwner(name,surname);
        BankAccount bankAccount = new BankAccount(initialBalance,owner);
        String ID = bankAccount.getID();
        String expectedID = "5000Emanuele";
        assertEquals(expectedID,ID);
    }

    @Test
    public void testPinGeneration(){
        boolean expectedResult = true;
        int pin = ba.generatePin();
        boolean actualResult = pin >= 1000 && pin <= 9999;
        assertEquals(expectedResult,actualResult);
    }
}
