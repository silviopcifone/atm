package test;

import org.junit.Test;
import sdk.model.Account;

import static org.junit.Assert.assertEquals;

public class TestAccount {

    @Test
    public void testAccountCreation() {
        int initialBalance = 5000;
        Account account = new Account(initialBalance);


    assertEquals(initialBalance, account.getBalance());

    }
}
