package atm2.test;
import atm2.model.Account2;
import atm2.model.AccountOwner2;
import atm2.model.Auth;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestAuth {

    @Test
    public void authenticationUser(){

        // TODO fare l' autenticazione
        String userName = "Chiara1";
        int pin = 1245;
        String idConto = "20Chiara";


        Auth authenticator = new Auth();
        AccountOwner2 owner = new AccountOwner2("Chiara", "1");
        Account2 account = new Account2(20,owner);
        owner.setAccount(account);

        Account2 expectedAccount = new Account2(20, new AccountOwner2("Chiara", "1"));

        authenticator.setUser(owner);
        Account2 account2 = authenticator.authenticate(userName, pin, idConto);


        assertEquals(expectedAccount.getInitialBalance(), account2.getInitialBalance());
        assertEquals(expectedAccount.getId(), account2.getId());
        assertEquals(expectedAccount.getOwner().getUsername(), account2.getOwner().getUsername());
    }
}
