package espoch.edu.ec.bank.objects;

public class Account {

    protected float balance;
    protected int numberDeposits = 0;
    protected int withDrawals = 0;
    protected float annualInterestRate;
    protected float monthlyFee = 0.0f;

    public Account(float balance, float annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumberDeposits() {
        return numberDeposits;
    }

    public void setNumberDeposits(int numberDeposits) {
        this.numberDeposits = numberDeposits;
    }

    public int getWithDrawals() {
        return withDrawals;
    }

    public void setWithDrawals(int withDrawals) {
        this.withDrawals = withDrawals;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

}
