package test;

import org.junit.Test;
import sdk.model.User;

import static org.junit.Assert.assertEquals;

public class TestUser {

    @Test
    public void testUserCreation() {
        String name = "Raffaele";
        String surname = "Papaleo";
        User user = new User(name, surname);
        String expectedUsername = name + surname;
        assertEquals(expectedUsername, user.getUsername());
    }




}
