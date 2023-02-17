package org.eih.atm.test;

import org.eih.atm.model.AccountOwner;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestAccountOwner {

    @Test
    public void testCreationOwnerWithAge(){
        String name = "Emanuele";
        String surname = "Valentini";
        int age = 25;
        AccountOwner accountOwner = new AccountOwner(name,surname,age);
        String expectedUsername = name+surname+age;
        assertEquals(expectedUsername,accountOwner.getUsername());
    }

    @Test
    public void testCreationOwnerNoAge(){
        String name = "Emanuele";
        String surname = "Valentini";
        AccountOwner accountOwner = new AccountOwner(name,surname);
        String expectedUsername = name + surname;
        assertEquals(expectedUsername,accountOwner.getUsername());
    }

    @Test
    public void testCreationOwnerID(){
        String name = "Emanuele";
        String surname = "Valentini";
        int age = 25;
        AccountOwner accountOwner = new AccountOwner(name,surname,age);
        String expectedID = age*2+surname;
        assertEquals(expectedID,accountOwner.getID());
    }



    /*
    Proprietario del conto corrente:
- Inizializzato con nome, cognome e età
- Il suo username deve essere generato automaticamente come username = nome+cognome+età
- Se l'età non è presente, utilizziamo solo nome+cognome
- ID utente generato come id = età*2 + cognome
     */
}
