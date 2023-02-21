package Test;

import sdk.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUser {


    @Test
    public void testUserGenerationWithoutAge() {
        String name = "Luigi";
        String surname = "Zannella";

        User user = new User (name,surname);

        String expectedUsername = name + surname;

        assertEquals(expectedUsername, user.username);
    }
}
