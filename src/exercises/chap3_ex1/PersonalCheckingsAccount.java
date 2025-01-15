package exercises.chap3_ex1;

public class PersonalCheckingsAccount extends CheckingsAccount{
    private int age;
    private String ssn;
    private String jobPosition;
    public PersonalCheckingsAccount(String fullName, double balance){
        super(fullName, balance);
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
    public String getJobPosition() {
        return jobPosition;
    }
    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }
    
}
