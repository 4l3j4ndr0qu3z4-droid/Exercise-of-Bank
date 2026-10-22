package espoch.edu.ec.bank.interfaces;

import espoch.edu.ec.bank.objects.SavingAccount;

public interface InterfaceSavingAccount {

    
    public boolean deposit(float value, SavingAccount savingsAccount);

    public boolean withdraw(float value, SavingAccount savingsAccount);

    public boolean monthlyStatement(SavingAccount savingAccount);

    public String display(SavingAccount savingAccount);
}
