
package test;

import org.junit.Test;
import sdk.model.User;

import static org.junit.Assert.assertEquals;
public class TestAtm {

    @Test
    public void testUserCreation(){
        User user = new User("silvio", "pablo");
        String expectedUsername = "silvio" + "pablo";
        assertEquals(expectedUsername, user.getUsername());
    }

}
