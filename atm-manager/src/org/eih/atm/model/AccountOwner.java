package org.eih.atm.model;

public class AccountOwner extends User
{

    public AccountOwner(String name, String surname){
        super(name, surname);
    }

    @Override
    public int generate() {
        int x = super.generate();
        return x++;
    }
}
