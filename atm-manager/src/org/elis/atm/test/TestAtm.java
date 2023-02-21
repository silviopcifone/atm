package org.elis.atm.test;

import org.elis.atm.model.Account;
import org.elis.atm.model.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestAtm {
    @Test
    public void testUserCreation(){

        String name = "Silvio";
        String surname="cifone";

        User user= new User(name,surname);
        String expetedUserName =name+surname;
        assertEquals(expetedUserName,user.getUsername());
    }

    @Test
    public void testAccountCreation(){
        int initialBalance= 10000;
        Account account= new Account(initialBalance);
        int expectedInitialBalance= initialBalance;
        assertEquals(expectedInitialBalance,account.getBalance());
    }
}
