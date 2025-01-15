package structural.proxy;

//service interface
public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
