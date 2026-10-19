package espoch.edu.ec.bank.objects;

public class CheckingAccount extends Account {

    protected float overdraft = 0.0f;

    public CheckingAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

}
