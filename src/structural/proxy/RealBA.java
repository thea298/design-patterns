package structural.proxy;

//service
public class RealBA implements BankAccount{
    private double balance;

    public RealBA(double balance){
        this.balance=balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance+=amount;
        System.out.println("Deposited "+amount);
    }

    @Override
    public void withdraw(double amount) {
        if(this.balance>=amount){    
            this.balance-=amount;
            System.out.println("RIch");
        }
        else{
            System.out.println("BROKE ASS");
        }
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
    
}
