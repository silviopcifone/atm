package org.eih.atm.test;

import junit.framework.TestCase;
import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestAccountOwner extends TestCase {
    AccountOwner ao;
    BankAccount ba1;
    BankAccount ba2;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ao = new AccountOwner("Emanuele","Valentini",25);
        ba1 = new BankAccount(10000, ao);
        ba2 = new BankAccount(ao);
    }

    @Test
    public void testCreationOwnerWithAge(){
        String name = "Emanuele";
        String surname = "Valentini";
        int age = 25;
        AccountOwner accountOwner = new AccountOwner(name,surname,age);
        String expectedUsername = name + surname + age;
        assertEquals(expectedUsername,accountOwner.getUsername());
    }

    @Test
    public void testCreationOwnerNoAge(){
        String name = "Emanuele";
        String surname = "Valentini";
        AccountOwner accountOwner = new AccountOwner(name,surname);
        String expectedUsername = name + surname;
        assertEquals(expectedUsername,accountOwner.getUsername());
    }

    @Test
    public void testCreationOwnerID(){
        String name = "Emanuele";
        String surname = "Valentini";
        int age = 25;
        AccountOwner accountOwner = new AccountOwner(name,surname,age);
        String expectedID = age * 2 + surname;
        assertEquals(expectedID,accountOwner.getID());
    }

    @Test
    public void testMultipliConti(){
        ao.setBankAccount(ba1);
        ao.setBankAccount(ba2);
        assertEquals(ba1,ao.getBankAccount().get(0));
        assertEquals(ba2,ao.getBankAccount().get(1));
    }
}
