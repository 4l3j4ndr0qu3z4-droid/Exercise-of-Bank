package espoch.edu.ec.bank.implementation;

import espoch.edu.ec.bank.objects.Account;

public class Accounts {

    public boolean deposit(float value, Account account) {
        float auxiliarDeposit = account.getBalance() + value;
        account.setBalance(auxiliarDeposit);
        int a = account.getNumberDeposits()+1;
        account.setNumberDeposits(a);
        return true;

    }

    public boolean withdraw(float value, Account account) {
        boolean res = false;
        if (value <= account.getBalance()) {
            float auxiliarDeposit = account.getBalance() - value;
            account.setBalance(auxiliarDeposit);
            int a = account.getWithDrawals()+1;
            account.setWithDrawals(a);
            res = true;
        }

        return res;
    }

    private float monthlyIntereset(Account account) {
        return (account.getAnnualInterestRate() / 12);

    }

    public boolean monthlyStatement(Account account) {
        float interesMensual = monthlyIntereset(account);
        float newBalance = account.getMonthlyFee() - ((account.getBalance() - account.getMonthlyFee()) * interesMensual);

        account.setBalance(newBalance);
        return true;
    }

    public String display(Account account) {
        return  ("BALANCE: "+account.getBalance()+"\nANUAL INTEREST: "+account.getAnnualInterestRate()+"\nMONTLY FLEE: "+account.getMonthlyFee()
                +"\nN° DEPOSITOS: "+account.getNumberDeposits()+"\nN° RETIROS: "+account.getWithDrawals());
    }
}
