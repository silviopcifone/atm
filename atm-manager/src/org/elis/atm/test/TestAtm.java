package org.elis.atm.test;

import org.elis.atm.model.Account;
import org.elis.atm.model.User;
import org.elis.atm.service.Atm;
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
    @Test
    public void testAuthentication () {
        Short pin = 1234;
        String username = "silviopablo174";
        Atm atm = new Atm();
        boolean isLoggedIn = atm.authenticate(username, pin);
        boolean expectedResult = true;
        assertEquals(expectedResult, isLoggedIn);
    }
}
