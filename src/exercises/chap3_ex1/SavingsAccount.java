package exercises.chap3_ex1;

public abstract class SavingsAccount extends Account{
    public SavingsAccount(String fullName, double balance, double interest){
        super(fullName, balance, 0, "savings");
    }
}
