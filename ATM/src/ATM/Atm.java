package ATM;

public class Atm {

    private double balanceAmount;
    private int withdrawAmount;
    private double depositAmount;


    public Atm() {


    }

    public Atm(double balanceAmount, int withdrawAmount, double depositAmount) {
        this.balanceAmount = balanceAmount;
        this.withdrawAmount = withdrawAmount;
        this.depositAmount = depositAmount;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount + balanceAmount;
    }
}
