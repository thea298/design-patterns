package exercises.chap3_ex1;

public class PersonalSavingsAccount extends SavingsAccount{
    private String ssn;
    private int age;
    private String job;
    public PersonalSavingsAccount(String fullName, double balance, double interest){
        super(fullName, balance, interest);
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    
}
