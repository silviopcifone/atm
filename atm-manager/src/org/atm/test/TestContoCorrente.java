package org.atm.test;

import org.atm.contoCorrente.ContoCorrente;
import org.atm.model.Account;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestContoCorrente {
    @Test
    public void testInizializationAccount(){
        int inizializationAccount= 1000;
        Account account= new Account(inizializationAccount);
        int expectedInizializationAccount= inizializationAccount;

        assertEquals(expectedInizializationAccount,account.getInitialBalance());
    }
    @Test
    public void testCreatinoAcoount(){
        String name= "mattia";
        Account account= new Account(name);
        String expectedID= account.getInitialBalance()+name;
        assertEquals(expectedID,account.getID());
    }
    @Test
    public void testCreationAcoount(){

        String name= "mattia";
        int inizializationAccount= 1000;
        Account account= new Account(inizializationAccount,name);
        String expectedID= account.getInitialBalance()+name;
        assertEquals(expectedID,account.getID());
    }

}
