package test;
import org.junit.Test;
import sdk.model.AccountOwner;
import sdk.model.BankAccount;

import static org.junit.Assert.assertEquals;
public class TestBanckAccount {

    @Test
    public void testAccountCreation() {
        // AccountOwner owner = new AccountOwner("Silvio", "Elis");
        int intialBalance = 1000;
        int expectedBlance = 1000;
        BankAccount bk = new BankAccount(intialBalance);
        assertEquals(expectedBlance, bk.getBalanceAmount());
    }

    @Test
    public void testAccountWithNoBalance() {
        // AccountOwner owner = new AccountOwner("Silvio", "Elis");
        int expectedBlance = 100;
        BankAccount bk = new BankAccount();
        assertEquals(expectedBlance, bk.getBalanceAmount());
    }

    @Test
    public void testAccountWithId() {
        AccountOwner owner = new AccountOwner("Silvio", "Elis");
        int intialBalance = 1000;
        String expectedId = intialBalance + owner.getSurname();
        BankAccount bk = new BankAccount(intialBalance, owner);
        assertEquals(expectedId, bk.getID());
    }
}
