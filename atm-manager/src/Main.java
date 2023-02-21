import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;
import org.eih.atm.service.Atm;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Atm atm = new Atm();
        AccountOwner owner = new AccountOwner("Emanuele","Valentini");
        BankAccount ba = new BankAccount(10000,owner);

        while(true)
        {
            atm.menuAtm(atm,ba);
        }
    }
}