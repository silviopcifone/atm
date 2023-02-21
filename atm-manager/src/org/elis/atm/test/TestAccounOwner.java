package org.elis.atm.test;

import org.elis.atm.model.AccountOwner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAccounOwner {
    @Test
    public void testAccountOwner() {
        String name = "mattia";
        String surname = "noce";
        AccountOwner accountOwner= new AccountOwner(name,surname);
        String expectedUsername = "mattianoce";
        String expectedId = "0noce";
        assertEquals(expectedUsername,accountOwner.getUsername());
        assertEquals(expectedId,accountOwner.getId());

    }
    public void testAccountOwnerEta() {
        String name = "mattia";
        String surname = "noce";
        int eta=21;
        AccountOwner accountOwner= new AccountOwner(name,surname);
        String expectedUsername = "mattianoce21";
        String expectedId = "42noce";
        assertEquals(expectedUsername,accountOwner.getUsername());
        assertEquals(expectedId,accountOwner.getId());

    }
}
