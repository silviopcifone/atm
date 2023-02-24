package org.eih.atm.service;

import org.eih.atm.exception.AtmOperationException;
import org.eih.atm.model.AccountOwner;
import org.eih.atm.model.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atm
{
    private List<BankAccount> bankAccountList;
    private List<AccountOwner> accountOwners;
    Scanner sc = new Scanner(System.in);

    public Atm(){
        this.accountOwners = new ArrayList<>();
        this.bankAccountList = new ArrayList<>();
    }

    private List<String> operations = new ArrayList<>();

    private List<Integer> transactions = new ArrayList<>();

    public boolean authenticate(String username, int pin) {
        return username.equals(accountOwners.get(0).getUsername()) &&
                pin == bankAccountList.get(0).getPin();
    }

    public List<BankAccount> getBankAccount() {
        return bankAccountList;
    }

    public List<AccountOwner> getAccountOwners() {
        return accountOwners;
    }

    public void setAccountOwners(AccountOwner accountOwner) {
        accountOwners.add(accountOwner);
    }

    public void setBankAccount(BankAccount ba) {
        bankAccountList.add(ba);
    }

    public int getBalance() {
        return bankAccountList.get(0).getBalanceAmount();
    }

    public void getBalaceAmount(){
        this.operations.add("Ha effettuato un controllo del saldo");
        bankAccountList.get(0).getBalanceAmount();
    }

    public void deposit(int deposit) {
        this.operations.add("Ha effettuato un Deposito");
        this.transactions.add(deposit);
        bankAccountList.get(0).setBalanceAmount(getBalance()+deposit);
    }

    public void withdraw(int withdraw) throws AtmOperationException {
        if(withdraw > getBalance()){
            throw new AtmOperationException("Il valore del prelievo è troppo alto");
        }else{
            this.operations.add("Ha effettuato un Prelievo");
            this.transactions.add(-withdraw);
            bankAccountList.get(0).setBalanceAmount(getBalance()-withdraw);
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
