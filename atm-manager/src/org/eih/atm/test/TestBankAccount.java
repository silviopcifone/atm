package org.eih.atm.test;

import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestBankAccount {

    @Test
    public void testCreateBankAccount(){
        String name = "Emanuele";
        String surname = "Valentini";
        AccountOwner owner = new AccountOwner(name,surname);
        int initialBalance = 5000;
        BankAccount bankAccount = new BankAccount(initialBalance,owner);
        int expectedBalance = initialBalance;
        assertEquals(expectedBalance, bankAccount.getBalanceAmount());
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
}
