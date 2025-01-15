package exercises.chap3_ex1;

public class CorporateService extends Bank{

    @Override
    public CheckingsAccount createCheckingsAccount(String fullName, double balance) {
        return new CorporateCheckingsAccount(null, 0);   
    }

    @Override
    public SavingsAccount createSavingsAccount(String fullName, double balance, double interest) {
        return new CorporateSavingsAccount(null, 0, 0);
    }
    
}
