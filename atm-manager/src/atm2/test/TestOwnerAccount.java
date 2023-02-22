package atm2.test;
import atm2.model.Account2;
import atm2.model.AccountOwner2;
import org.junit.Test;
import atm.model.service.Atm;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestOwnerAccount {

    @Test
    public void ownerCreationTest() {
        byte age = 22;
        int initialBalance = 10000;
        AccountOwner2 owner = new AccountOwner2("Raf","Papaleo",age);
        Account2 account = new Account2(10000, owner);
        assertEquals(owner, account.getOwner());

    }

    @Test
    public void ownerUsernameTest() {
        byte age = 22;
        AccountOwner2 owner = new AccountOwner2("Raf","Papaleo",age);
        String expectedUsername = "Raf"+"Papaleo"+age;
        assertEquals(expectedUsername, owner.getUsername());
    }


    @Test
    public void ownerUsernameTestWithNoAge() {
        AccountOwner2 owner = new AccountOwner2("Raf","Papaleo");
        String expectedUsername = "Raf"+"Papaleo";
        assertEquals(expectedUsername, owner.getUsername());
    }

    @Test
    public void ownerIdTest() {
        byte age = 22;
        AccountOwner2 owner = new AccountOwner2("Raf","Papaleo", age);
        String expectedId = (age*2)+"Papaleo";
        assertEquals(expectedId, owner.getId());
    }
/*
    @Test
    public void ownerManyAccountsTest() {
        byte age = 22;
        int initialBalance = 10000;
        AccountOwner2 owner = new AccountOwner2("Raf", "Papaleo", age);
        String expectedName = "Raf";
        String expectedSurname = "Papaleo";
        List<Account2> accountList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Account2 account = new Account2(initialBalance, owner);
            accountList.add(account);
            assertEquals(expectedName, accountList.get(i).getOwner().getName());
            assertEquals(expectedSurname, accountList.get(i).getOwner().getSurname());
        }

    }

 */
    @Test
    public void ownerManyAccountsTest() {
        AccountOwner2 owner = new AccountOwner2("lorenzo", "uddin");
        // AccountOwner2 owner = new AccountOwner2("lorenzo", "uddin");

       Account2 account = new Account2(100,owner);
       Account2 account2 = new Account2(200,owner);

       owner.setAccount(account);
       owner.setAccount(account2);

       String expectedId1 = 100 + "lorenzo";
       String expectedId2 = 200 + "lorenzo";

       List<Account2> accountList = owner.getAccounts();

       assertEquals(expectedId1, accountList.get(0).getGeneratedID());
       assertEquals(expectedId2, accountList.get(1).getGeneratedID());

    }

}
