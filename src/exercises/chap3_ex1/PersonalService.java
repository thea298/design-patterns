package exercises.chap3_ex1;

public class PersonalService extends Bank{

    @Override
    public CheckingsAccount createCheckingsAccount(String fullName, double balance) {
        return new PersonalCheckingsAccount(fullName, balance);
    }

    @Override
    public SavingsAccount createSavingsAccount(String fullName, double balance, double interest) {
        return new PersonalSavingsAccount(fullName, balance, interest);
    }
    
}
