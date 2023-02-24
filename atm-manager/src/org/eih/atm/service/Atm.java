package org.eih.atm.service;

import org.eih.atm.exception.AtmOperationException;
import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;

import java.util.*;

public class Atm
{
    private Map<String,BankAccount> bankAccountList;
    private List<AccountOwner> accountOwners;
    Scanner sc = new Scanner(System.in);

    public Atm(){
        this.accountOwners = new ArrayList<>();
        this.bankAccountList = new HashMap<>();
    }

    private List<String> operations = new ArrayList<>();

    private List<Integer> transactions = new ArrayList<>();

    public Map<String,BankAccount> getBankAccount() {
        return bankAccountList;
    }

    public List<AccountOwner> getAccountOwners() {
        return accountOwners;
    }

    public void setAccountOwners(AccountOwner accountOwner) {
        accountOwners.add(accountOwner);
    }

    public void setBankAccount(String ID,BankAccount ba) {
        bankAccountList.put(ID,ba);
    }

    public int getBalance(String ID) {
        return bankAccountList.get(ID).getBalanceAmount();
    }

    public void deposit(String ID,int deposit) {
        this.operations.add("Ha effettuato un Deposito");
        this.transactions.add(deposit);
        bankAccountList.get(ID).setBalanceAmount(getBalance(ID)+deposit);
    }

    public void withdraw(String ID,int withdraw) throws AtmOperationException {
        if(withdraw > getBalance(ID)){
            throw new AtmOperationException("Il valore del prelievo è troppo alto");
        }else{
            this.operations.add("Ha effettuato un Prelievo");
            this.transactions.add(-withdraw);
            bankAccountList.get(ID).setBalanceAmount(getBalance(ID)-withdraw);
        }
    }

    public String generateMenu() {
        return "cosa vuoi fare? \n 1) Saldo contabile \n 2) Prelievo \n 3) Deposito \n 4) Esci " +
                "\n Premi il tasto corrispondente all'operazione che vuoi effettuare";
    }

    public String getWelcome() {
        return "Benvenuto nell'atm";
    }

    public List<String> getOperations() {
        return operations;
    }

    public void addOperation(String id, List<String> operations){
        int i = 0;
        for (String operation:operations) {
            operations.set(i,(id+" "+operation));
            i++;
        }
    }

    public List<Integer> getTransactions() {
        return transactions;
    }
}
