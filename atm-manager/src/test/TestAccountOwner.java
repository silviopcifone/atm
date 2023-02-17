package test;

import org.junit.Test;
import sdk.model.AccountOwner;
import sdk.model.User;


import static org.junit.Assert.assertEquals;

public class TestAccountOwner {


    @Test
    public void testAccountOwnerUsername() {
        String name = "Raffaele";
        String surname = "Papaleo";
        int età = 22;
        AccountOwner owner = new AccountOwner(name, surname, età);

        String expectedUsername = name + surname + età;
        assertEquals(expectedUsername, owner.getUsername());

    }

    @Test
    public void testAccountOwnerUsername2() {
        String name = "Raffaele";
        String surname = "Papaleo";
        User user = new User(name, surname);
        String expectedUsername2 = name + surname;
        assertEquals(expectedUsername2, user.getUsername());
    }

    @Test
    public void testAccountID() {
        String name = "Raffaele";
        String surname = "Papaleo";
        int età = 22;
        String id = età * 2 + surname;
        AccountOwner owner = new AccountOwner(name, surname, età);

    assertEquals(id, owner.getId());


    }


}
