package test;

import org.junit.Before;
import org.junit.Test;
import sdk.model.Account;
import sdk.model.AccountOwner;

import static org.junit.Assert.assertEquals;

public class TestAccount {

    AccountOwner owner;
    Account account;

    @Before
    public void setUp() throws Exception {
        byte age = 29;
        owner = new AccountOwner("Luigi", "Zannella", age);
        account = new Account(10000, owner);
    }

    @Test
    public void accountCreationTest() {
        int initialBalance = 200000;
        String name = "Luigi";
        String surname = "Zannella";
        byte age = 29;
        AccountOwner expectedOwner = new AccountOwner(name, surname, age);
        Account account = new Account(initialBalance, expectedOwner);

        assertEquals(expectedOwner, account.getOwner());
    }

    @Test
    public void accountCreationWithNoBalance() {

        int expectedBalance = 100;
        String name = "Luigi";
        String surname = "Zannella";
        byte age = 29;
        AccountOwner owner = new AccountOwner(name, surname, age);
        Account account = new Account(owner);
        assertEquals(expectedBalance, account.getInitialBalance());
    }

    @Test
    public void accountIdTest() {

        int initialBalance = 200000;
        String name = "Luigi";
        String surname = "Zannella";
        byte age = 29;
        AccountOwner owner = new AccountOwner(name, surname, age);
        Account account = new Account(initialBalance, owner);
        String expectedID = initialBalance + name;
        assertEquals(expectedID, account.generateId(initialBalance, owner.getName()));

    }

    @Test
    public void accountPinTest() {

        int initialBalance = 200000;
        int expectedPin = 1234;
        String name = "Luigi";
        String surname = "Zannella";
        byte age = 29             ;
        AccountOwner owner = new AccountOwner(name, surname, age);
        Account account = new Account(initialBalance, owner, expectedPin);
        assertEquals(expectedPin, account.getPin());

    }

    @Test
    public void testPinGeneration() {

        boolean expectedResult = true;
        int pin = account.generatePin();
        boolean actualResult = pin >= 1000 && pin <= 9999;
        assertEquals(expectedResult, actualResult);
    }

}
