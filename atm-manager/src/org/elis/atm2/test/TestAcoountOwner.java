package org.elis.atm2.test;

import org.elis.atm2.model.Account2;
import org.elis.atm2.model.AccountOwner2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAcoountOwner {


    @Test
    public void testGenerationUsername() {
        AccountOwner2 owner = new AccountOwner2("Mattia", "Noce", 21);

        String username = owner.generateUsername();
        String expectedUsername = (owner.getName() + owner.getSurname() + owner.getAge());
        //String expectedUsername = "MattiaNoce21" ;

        assertEquals(expectedUsername, username);
    }

    @Test
    public void testGenerationUsernameWithNoAge() {
        AccountOwner2 owner = new AccountOwner2("Mattia", "Noce");

        String username = owner.generateUsername();
        String expectedUsername = (owner.getName() + owner.getSurname());
        //String expectedUsername = "MattiaNoce" ;

        assertEquals(expectedUsername, username);
    }

    @Test
    public void testCreationId() {
        AccountOwner2 owner = new AccountOwner2("Mattia", "Noce");

        String id = owner.generateId();
        String expectedId = "0Noce";
        assertEquals(expectedId, id);
    }

    @Test
    public void testMultiAccount() {

        AccountOwner2 ao = new AccountOwner2("Emanuele", "Valentini", 25);
        Account2 ba1 = new Account2(10000, ao);
        Account2 ba2 = new Account2(ao);

        ao.setBankAccount(ba1);
        ao.setBankAccount(ba2);
        assertEquals(ba1, ao.getBankAccount().get(0));
        assertEquals(ba2, ao.getBankAccount().get(1));

    }
}
