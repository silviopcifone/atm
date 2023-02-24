package atm2.test;
import atm2.model.Account2;
import atm2.model.AccountOwner2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAccount {
    AccountOwner2 owner;
    Account2 account;

    @Before
    public void setUp() throws Exception {
        byte age = 25;
        owner = new AccountOwner2("Emanuele", "Valentini", age);
        account = new Account2(10000, owner);
    }

    @Test
    public void accountCreation(){
        int initialBalance = 2000;
        String name = "Silvio";
        String surname = "Noce";
        Byte age = 12;

        AccountOwner2 owner = new AccountOwner2(name, surname, age);
        Account2 account = new Account2(initialBalance, owner);

        int expectedBalance = 2000;
        assertEquals(expectedBalance, account.getInitialBalance());

        AccountOwner2 expectedOwner = new AccountOwner2(name, surname, age);
        assertEquals(expectedOwner.name, account.getOwner().getName());
        assertEquals(expectedOwner.surname, account.getOwner().getSurname());
    }

    @Test
    public void accountWithNoInitialBalance(){
        String name = "Silvio";
        String surname = "Noce";
        Byte age = 12;

        AccountOwner2 owner = new AccountOwner2(name, surname, age);
        Account2 account = new Account2(owner);

        int expectedBalance = 100;
        assertEquals(expectedBalance, account.getInitialBalance());
    }

    @Test
    public void generateID(){
        int initialBalance = 2000;
        String name = "Silvio";
        String surname = "Noce";
        Byte age = 12;

        AccountOwner2 owner = new AccountOwner2(name, surname, age);
        Account2 account = new Account2(initialBalance, owner);

        String expectedID = 2000 + "Silvio";
        assertEquals(expectedID, account.getId());
    }

    @Test
    public void accountPinTest() {
        int initialBalance = 200000;
        int expectedPin = 1234;
        String name = "Raf";
        String surname = "Papa";
        byte age = 22;
        AccountOwner2 owner = new AccountOwner2(name, surname, age);
        Account2 account = new Account2(initialBalance, owner, expectedPin);
        Assert.assertEquals(expectedPin, account.getPin());
    }

    @Test
    public void testPinGeneration() {

        boolean expectedResult = true;
        int pin = account.generatePin();
        boolean actualResult = pin >= 1000 && pin <= 9999;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
