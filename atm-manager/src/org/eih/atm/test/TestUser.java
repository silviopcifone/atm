package org.eih.atm.test;

import org.eih.atm.model.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestUser {

    @Test
    public void testUserCreation(){
        String name = "Silvio";
        String surname = "Cifone";
        User user = new User(name,surname);
        String expectedUsername = name + surname;
        assertEquals(expectedUsername,user.getUsername());
    }
}
