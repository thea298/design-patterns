package exercises.chap3_ex1;

//abstract factory - could be an interface because we did not use fields
public abstract class Bank {
    public abstract CheckingsAccount createCheckingsAccount(String fullName, double balance);
    public abstract SavingsAccount createSavingsAccount(String fullName, double balance, double interest);
}
