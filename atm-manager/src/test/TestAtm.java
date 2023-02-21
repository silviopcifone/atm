package test;

import org.junit.Test;
import sdk.model.User;
import service.Atm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAtm {

    @Test
    public void testCorrectAuthentication() {
        String username = "RaffaelePapaleo24";
        short pin = 1234;
        Atm atm = new Atm();
        boolean isLoggedIn  = atm.authenticate(username, pin);

        assertTrue(isLoggedIn);


    }

}
