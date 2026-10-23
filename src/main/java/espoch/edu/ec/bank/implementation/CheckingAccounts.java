package espoch.edu.ec.bank.implementation;

import espoch.edu.ec.bank.interfaces.InterfaceCheckingAccount;
import espoch.edu.ec.bank.objects.CheckingAccount;

public class CheckingAccounts extends Accounts implements InterfaceCheckingAccount {

    @Override
    public boolean deposit(float value, CheckingAccount checkingAccount) {
        boolean res = false;
        super.deposit(value, checkingAccount);
        if (checkingAccount.getOverdraft() > 0) {
            //float temp = value - checkingAccount.getOverdraft();
            //float tem = checkingAccount.getBalance()+ temp;
            float temp = checkingAccount.getBalance()-checkingAccount.getOverdraft();
            checkingAccount.setBalance(temp);
            res = true;
        }
        return res;
    }

    @Override
    public boolean withdraw(float value, CheckingAccount checkingAccount) {
        boolean res = false;
        if(value > checkingAccount.getBalance()){
            float temp = checkingAccount.getBalance()-value;
            checkingAccount.setOverdraft(temp);
        
        }
        float tem = checkingAccount.getBalance()- value;
        checkingAccount.setBalance(tem);
        return res;
    }

    @Override
    public boolean monthlyStatement(CheckingAccount checkingAccount) {
        super.monthlyStatement(checkingAccount);
        return true;
    }

    //a new print method displays the account balance, the 
    //monthly fee, the number of transactions made (sum of deposits and withdrawals), and the overdraft value
    @Override
    public String display(CheckingAccount checkingAccount) {
        return ("BALANCE: " + checkingAccount.getBalance() + "MONTLY FEE: " + checkingAccount.getMonthlyFee() + "DEPOSITS: " + checkingAccount.getNumberDeposits() + "REITROS: " + checkingAccount.getWithDrawals() + "OVERDRAFT: " + checkingAccount.getOverdraft());
    }
}
