package espoch.edu.ec.bank.interfaces;

import espoch.edu.ec.bank.objects.CheckingAccount;

public interface InterfaceCheckingAccount {

    public boolean deposit(float value, CheckingAccount checkingAccount);

    public boolean withdraw(float value, CheckingAccount checkingAccount);

    public boolean monthlyStatement(CheckingAccount checkingAccount);

    public String display(CheckingAccount checkingAccount);
}
