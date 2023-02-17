package org.eih.atm.test;

import org.eih.atm.model.AccountOwner;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestAccountOwner {

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
        String expectedID = age*2+surname;
        assertEquals(expectedID,accountOwner.getID());
    }
}
