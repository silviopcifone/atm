package atm2.model;

public class Atm2 {
    private String userName;
    private int pin;
    Account2 account;
    public Atm2(Account2 account) {
        this.account = account;
    }
    public Atm2(String userName, int pin) {
        setUserName(userName);
        setPin(pin);
        this.pin = pin;
    }

    public  boolean authenticate(String userName, int pin) {
        boolean result = false;
        if (userName == this.userName && pin == this.pin){
            result = true;
        }
        return result;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return account.getInitialBalance();
    }


    public void deposit(int money) {
        this.account.addToBalance(money);
    }

    public void withdraw(int money) {
        this.account.removeToBalance(money);
    }


}
