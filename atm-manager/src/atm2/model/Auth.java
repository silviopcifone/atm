package atm2.model;

import java.util.HashMap;

public class Auth {

    HashMap<String, AccountOwner2> owners = new HashMap<>();
    public void setUser(AccountOwner2 user) {
        owners.put(user.getUsername(), user);
    }

    public Account2 authenticate(String userName, int pin, String idConto) {
        Account2 accountToReturn = null;


        return (Account2) owners.get(userName).getAccounts().get(idConto);
    }
}
