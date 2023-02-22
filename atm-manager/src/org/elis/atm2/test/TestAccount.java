package org.elis.atm2.test;


import org.elis.atm2.model.Account2;
import org.elis.atm2.model.AccountOwner2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAccount {
    @Test
    public void testAcoountCreation() {
        int initialBalance = 1000;
        byte eta = 24;

        AccountOwner2 owner = new AccountOwner2("silvio", "cifone",24);
        Account2 account = new Account2(initialBalance, owner);

        int expectedInitialBalace = initialBalance;
        assertEquals(expectedInitialBalace, account.getBalance());

        AccountOwner2 expectedOwner = new AccountOwner2("silvio", "cifone",24);

        assertEquals(expectedOwner.getName(), owner.getName());
        assertEquals(expectedOwner.getSurname(), owner.getSurname());

        String expetctedId = initialBalance + owner.getName();

        assertEquals(expetctedId, account.getId());

    }

    @Test
    public void testAccountWithNoBalance() {
        AccountOwner2 owner = new AccountOwner2("Silvio", "Cifone");

        Account2 account = new Account2(owner);
        int expectedBalance = 100;
        assertEquals(expectedBalance, account.getBalance());

        String expetctedId = expectedBalance + owner.getName();

        assertEquals(expetctedId, account.getId());
    }

    @Test
    public void testCreateId() {

        AccountOwner2 owner = new AccountOwner2("silvio", "cifone");
        int initialBalance = 1000;

        Account2 account = new Account2(initialBalance, owner);

        String expetctedId = initialBalance + owner.getName();

        assertEquals(expetctedId, account.generateId(initialBalance, owner.getName()));
    }

    @Test
    public void testGeneratePin() {
        AccountOwner2 owner = new AccountOwner2("Mattia", "Noce");
        Account2 account = new Account2(1000, owner);
        int pin = account.generatePin();
        boolean expectedResult = true;
        boolean actualResult = pin >= 1000 && pin <= 9999;
        assertEquals(expectedResult, actualResult);
    }


}
