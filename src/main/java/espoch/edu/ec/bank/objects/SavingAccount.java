package espoch.edu.ec.bank.objects;

public class SavingAccount extends Account {

    protected boolean activeSavingsAccount;

    public SavingAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
    }

    
    
    public SavingAccount(boolean activeSavingsAccount, float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
        this.activeSavingsAccount = activeSavingsAccount;
    }

    public boolean isActiveSavingsAccount() {
        return activeSavingsAccount;
    }

    public void setActiveSavingsAccount(boolean activeSavingsAccount) {
        this.activeSavingsAccount = activeSavingsAccount;
    }

}
