package espoch.edu.ec.bank;

import espoch.edu.ec.bank.implementation.SavingAccounts;
import espoch.edu.ec.bank.interfaces.InterfaceSavingAccount;
import espoch.edu.ec.bank.objects.SavingAccount;

public class Bank {

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(true, 15000, 12);
        InterfaceSavingAccount savingAccounts = new SavingAccounts();
        
        savingAccounts.deposit(1000 , savingAccount);
        savingAccounts.withdraw(2000, savingAccount);
        System.out.println(savingAccounts.display(savingAccount));
    }
}
