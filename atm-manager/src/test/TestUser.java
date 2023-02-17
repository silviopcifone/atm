package test;

import org.junit.Test;
import sdk.model.User;
import static org.junit.Assert.assertEquals;

public class TestUser {

    @Test
    public void testUserCreation() {
        String expectedName = "Silvio";
        String expectedSurname = "Cifone";
        int expectedAge = 24;
        User user = new User(expectedName, expectedSurname, expectedAge);

        assertEquals(expectedName, user.name);
        assertEquals(expectedSurname, user.surname);
        assertEquals(expectedAge, user.age);
    }

    @Test
    public void testUsernameGeneration() {
        String name = "Silvio";
        String surname = "Cifone";
        int age = 24;

        User user = new User(name, surname, age);

        String expectedUsername = name + surname + age;

        //ExpectedUsername -> SilvioCifone24 = SilvioCifone24 <- ActualUsername = user.username
        assertEquals(expectedUsername, user.username);
    }

    @Test
    public void testUsernameGenerationWithoutAge() {
        String name = "Silvio";
        String surname = "Cifone";

        User user = new User(name, surname);

        String expectedUsername = name + surname;

        assertEquals(expectedUsername, user.username);
    }
}
