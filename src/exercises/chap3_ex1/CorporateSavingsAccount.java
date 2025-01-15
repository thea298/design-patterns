package exercises.chap3_ex1;

public class CorporateSavingsAccount extends SavingsAccount{
    private String company;
    public CorporateSavingsAccount(String fullName, double balance, double interest){
        super(fullName, balance, interest);
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    
}
