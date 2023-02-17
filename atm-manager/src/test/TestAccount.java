package test;

import org.junit.Test;
import sdk.model.Account;
import sdk.model.AccountOwner;

import static org.junit.Assert.assertEquals;

public class TestAccount {

    @Test
    public void testAccountCreation() {
        int initialBalance = 5000;
        Account account = new Account(initialBalance);


    assertEquals(initialBalance, account.getBalance());

    }

    @Test
    public void testAccountID() {
        int initialBalance = 5000;


        AccountOwner owner = new AccountOwner("Raffaele","Papaleo");
        String id = initialBalance + owner.getName();
                Account account = new Account(initialBalance, owner);


        assertEquals(id, account.getID());

    }

    @Test
    public void testAccountCreationWithoutBalance() {
        AccountOwner owner = new AccountOwner("Raffaele", "Papaleo");
        Account account = new Account(owner);

        assertEquals(100, account.getBalance());

    }
}
