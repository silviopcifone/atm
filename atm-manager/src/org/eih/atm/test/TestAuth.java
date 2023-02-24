package org.eih.atm.test;
import junit.framework.TestCase;
import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;
import org.eih.atm.service.Atm;
import org.eih.atm.service.Auth;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestAuth extends TestCase {

    Atm atm;
    AccountOwner ao;
    BankAccount ba;
    Auth au;
    @Override
    protected void setUp() throws Exception{
        super.setUp();
        atm = new Atm();
        au = new Auth();
        ao = new AccountOwner("Emanuele","Valentini",25);
        ba = new BankAccount(10000, ao);
        ao.setBankAccount(ba);
        atm.setBankAccount(ba.getID(),ba);
        au.setAccountOwnerList(ao);
        au.setBankAccountList(ba);
    }
    @Test
    public void testAuthenticate(){
        boolean isLoggedIn = au.authenticate(ao.getUsername(),ba.getID(),ba.getPin());
        boolean expectedResult = true;
        assertEquals(expectedResult, isLoggedIn);
    }

}
