package org.eih.atm.service;

import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Auth {
/*
    -   Verificare che il proprietario possegga il conto
        e solo a quel punto che il pin sia corretto
    -   Salvare in qualche modo il conto che è stato autenticato
        Così da passarlo all'atm.
 */
    List<AccountOwner> accountOwnerList = new ArrayList<>();
    List<BankAccount> bankAccountList = new ArrayList<>();
    public boolean authenticate(String username, String id, int pin) {
        for (AccountOwner ao:accountOwnerList) {
            if(ao.getUsername().equals(username)){
                for(BankAccount ba:bankAccountList){
                    if(ba.getID().equals(id)){
                        if(ba.getPin() == pin){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public List<AccountOwner> getAccountOwnerList() {
        return accountOwnerList;
    }

    public void setAccountOwnerList(AccountOwner ao) {
        accountOwnerList.add(ao);
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(BankAccount ba) {
        bankAccountList.add(ba);
    }
}
