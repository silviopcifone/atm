package org.eih.atm.test;

import org.eih.atm.model.BankAccount;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestBankAccount {

    @Test
    public void testCreateBankAccount(){
        int initialBalance = 5000;
        BankAccount bankAccount = new BankAccount(initialBalance);
        int expectedBalance = initialBalance;
        assertEquals(expectedBalance, initialBalance);
    }
}
