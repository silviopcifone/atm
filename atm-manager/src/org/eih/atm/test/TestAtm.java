package org.eih.atm.test;

import junit.framework.TestCase;
import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;
import org.eih.atm.service.Atm;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestAtm extends TestCase {
    /*
    Atm:
    autenticare l’utente
    pin autogenerato short "4 cifre"
    abilitare deposito, prelievo e visualizzazione bilancio
    visualizzare il menù
    permettere la creazione e la modifica degli utenti
    Storico operazioni per utente: “<UtenteID> ha effettuato la seguente <operazione>”
    storico delle transazioni per utente: invece di operazione hai il valore +se deposito -se prelevo
     */
    BankAccount ba;
    AccountOwner ao;
    Atm atm;

    @Override
    protected void setUp() throws Exception{
        super.setUp();
        atm = new Atm();
        ao = new AccountOwner("Emanuele","Valentini",25);
        ba = new BankAccount(10000, ao);
        ao.setBankAccount(ba);
        atm.setBankAccount(ba);
    }


    @Test
    public void testAuthentication(){
        boolean isLoggedIn = atm.authenticate(ao.getUsername(),ba.getPin());
        boolean expectedResult = true;
        assertEquals(expectedResult, isLoggedIn);
    }

    @Test
    public void testFunctions(){
        
    }
}
