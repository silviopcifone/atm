package test;

import org.junit.Test;
import sdk.model.Account;
import sdk.model.AccountOwner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestAccountOwner {

    @Test
    public void ownerCreationTest() {
        byte age = 29;
        int initialBalance = 10000;
        AccountOwner owner = new AccountOwner("Luigi", "Zannella", age);
        Account account = new Account(10000, owner);
        assertEquals(owner, account.getOwner());

    }

    @Test
    public void ownerUsernameTest() {
        byte age = 29;
        AccountOwner owner = new AccountOwner("Luigi", "Zannella", age);
        String expectedUsername = "Luigi" + "Zannella" + age;
        assertEquals(expectedUsername, owner.getUsername());
    }


    @Test
    public void ownerUsernameTestWithNoAge() {

        AccountOwner owner = new AccountOwner("Luigi", "Zannella");
        String expectedUsername = "Luigi" + "Zannella";
        assertEquals(expectedUsername, owner.getUsername());
    }

    @Test
    public void ownerIdTest() {
        byte age = 29;
        AccountOwner owner = new AccountOwner("Luigi", "Zannella", age);
        String expectedId = (age * 2) + "Zannella";
        assertEquals(expectedId, owner.getId());
    }

    @Test
    public void ownerManyAccountsTest() {
        byte age = 29;
        int initialBalance = 10000;
        AccountOwner owner = new AccountOwner("Luigi", "Zannella", age);
        String expectedName = "Luigi";
        String expectedSurname = "Zannella";
        List<Account> accountList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Account account = new Account(initialBalance, owner);
            accountList.add(account);
            assertEquals(expectedName, accountList.get(i).getOwner().getName());
            assertEquals(expectedSurname, accountList.get(i).getOwner().getSurname());
        }

    }

}