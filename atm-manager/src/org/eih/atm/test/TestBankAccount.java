package org.eih.atm.test;

import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestBankAccount {

    @Test
    public void testCreateBankAccount(){
        String name = "Emanuele";
        String surname = "Valentini";
        AccountOwner owner = new AccountOwner(name,surname);
        int initialBalance = 5000;
        BankAccount bankAccount = new BankAccount(initialBalance,owner);
        int expectedBalance = initialBalance;
        assertEquals(expectedBalance, initialBalance);
    }

    @Test
    public void testCreateBankAccountNoBalance(){
        String name = "Emanuele";
        String surname = "Valentini";
        AccountOwner owner = new AccountOwner(name,surname);
        int initialBalance = 100;
        BankAccount bankAccount = new BankAccount(owner);
        int expectedBalance = initialBalance;
        assertEquals(initialBalance,expectedBalance);
    }

    @Test
    public void testIDBankAccount(){
        String name = "Emanuele";
        String surname = "Valentini";
        AccountOwner owner = new AccountOwner(name,surname);
        BankAccount bankAccount = new BankAccount(owner);
        String ID = bankAccount.getID();
        String expectedID = "100.0Emanuele";
        assertEquals(expectedID,ID);
    }

    /*
    Conto corrente:
- Inizializzato con Bilancio iniziale.
- Se non ho bilancio iniziale, voglio che venga impostato balance = 100
- ID = bilancioIniziale + Nome del proprietario

     */
}
