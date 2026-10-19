package espoch.edu.ec.bank.interfaces;

public interface InterfaceCheckingAccount {

    public float deposit(float value);

    public float withdraw(float value);

    public float monthlyStatement();

    public String display();
}
