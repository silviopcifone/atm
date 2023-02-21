package org.eih.atm.test;

import org.eih.atm.model.AccountOwner;
import org.eih.atm.service.Atm;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestAtm {
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
    @Test
    public void testAuthentication(){
        String username = "EmanueleValentini25";
        int pin = 1234;
        Atm atm = new Atm();
        boolean isLoggedIn = atm.authenticate(username, pin);
        boolean expectedResult = true;
        assertEquals(expectedResult, isLoggedIn);
    }
}
