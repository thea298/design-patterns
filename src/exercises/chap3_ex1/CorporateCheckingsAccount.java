package exercises.chap3_ex1;

public class CorporateCheckingsAccount extends CheckingsAccount{
    private String company;
    public CorporateCheckingsAccount(String fullName, double balance){
        super(fullName, balance);
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    
}
