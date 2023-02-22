package org.eih.atm.service;

import org.eih.atm.exception.AtmOperationException;
import org.eih.atm.model.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atm
{
    private List<BankAccount> bankAccountList;
    Scanner sc = new Scanner(System.in);

    public Atm(){
        this.bankAccountList = new ArrayList<>();
    }




    public boolean authenticate(String username, int pin) {
        return username.equals(bankAccountList.get(0).getOwner().getUsername()) &&
                pin == bankAccountList.get(0).getPin();
    }

    public List<BankAccount> getBankAccount() {
        return bankAccountList;
    }

    public void setBankAccount(BankAccount ba) {
        bankAccountList.add(ba);
    }

    public int getBalance() {
        return bankAccountList.get(0).getBalanceAmount();
    }

    public void deposit(int deposit) {
        bankAccountList.get(0).setBalanceAmount(getBalance()+deposit);
    }

    public void withdraw(int withdraw) throws AtmOperationException {
        if(withdraw > getBalance()){
            throw new AtmOperationException("Il valore del prelievo è troppo alto");
        }else{
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
}
