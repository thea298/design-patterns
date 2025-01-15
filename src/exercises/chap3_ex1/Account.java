package exercises.chap3_ex1;

public abstract class Account {
    private String fullName;
    private double balance;
    private double interest;
    private String type;

    public Account(String fullName, double balance, double interest, String type) {
        this.fullName = fullName;
        this.balance = balance;
        this.interest = interest;
        this.type=type;
    }

    public double calculateInterest(){
        return this.balance*this.interest;
    }

    public void updateBalance(Double amount){
        this.balance+=amount;
    }

    public void printSummary(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Account [fullName="+fullName+ ", balance="
                +balance+", interest="+interest+", type="+type+"]";
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
