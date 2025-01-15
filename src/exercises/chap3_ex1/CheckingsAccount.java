package exercises.chap3_ex1;

public abstract class CheckingsAccount extends Account{
    public CheckingsAccount(String fullName, double balance){
        super(fullName, balance, 0, "checkings");
    }
}
