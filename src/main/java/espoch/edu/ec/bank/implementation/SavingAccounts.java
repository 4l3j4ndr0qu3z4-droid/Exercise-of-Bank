package espoch.edu.ec.bank.implementation;

import espoch.edu.ec.bank.interfaces.InterfaceSavingAccount;
import espoch.edu.ec.bank.objects.SavingAccount;

public class SavingAccounts extends Accounts implements InterfaceSavingAccount {

    private boolean stateAccount(SavingAccount savingsAccount) {
        if (savingsAccount.getBalance() >= 10000) {
            savingsAccount.setActiveSavingsAccount(true);
        } else {
            savingsAccount.setActiveSavingsAccount(false);
        }
        return savingsAccount.isActiveSavingsAccount();
    }

    @Override
    public boolean deposit(float value, SavingAccount savingsAccount) {
        boolean res = false;
        if (stateAccount(savingsAccount)) {
            res = super.deposit(value, savingsAccount);
        }
        return res;
    }

    @Override
    public boolean withdraw(float value, SavingAccount savingsAccount) {
        boolean res = false;

        if (stateAccount(savingsAccount)) {
            res = super.withdraw(value, savingsAccount);
        }
        return res;
    }

    @Override
    public boolean monthlyStatement(SavingAccount savingAccount) {
        int temp = savingAccount.getWithDrawals();
        boolean res = false;
        temp += 1;
        savingAccount.setWithDrawals(temp);
        if (savingAccount.getWithDrawals() > 4) {
            float t = savingAccount.getMonthlyFee();
            t += 1000;
            savingAccount.setMonthlyFee(t);
            stateAccount(savingAccount);
            res = true;
        }
        return res;
    }
    
    public String display(SavingAccount savingAccount) {
        return ("BALANCE: " + savingAccount.getBalance() + " MONTLY FEE: " + savingAccount.getMonthlyFee() + "DEPOSITS: " + savingAccount.getNumberDeposits() + "WITHDRAWALS:" + savingAccount.getWithDrawals());
    }
}
