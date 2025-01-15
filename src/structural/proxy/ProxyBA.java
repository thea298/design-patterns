package structural.proxy;

import java.util.Scanner;

//proxy
public class ProxyBA implements BankAccount{
    private RealBA account;
    private String password;

    public ProxyBA(RealBA account, String password) {
        this.account = account;
        this.password = password;
    }

    public boolean authenticate(String password){
        if(this.password.equals(password)) return true;
        else{
        System.out.println("Authentication failed");
        return false;
    }
}

    @Override
    public void deposit(double amount) {
        System.out.println("Password sir: ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        if(this.authenticate(input)){
            this.account.deposit(amount);
        }
        else{
            System.out.println("Cannot deposit");
        }
        scanner.close();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Password sir: ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        if(this.authenticate(input)){
            this.account.withdraw(amount);
        }
        else{
            System.out.println("Cannot withdraw");
        }
        scanner.close();
    }


    @Override
    public double getBalance() {
        System.out.println("Password sir: ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        if(this.authenticate(input)){
            scanner.close();
            return this.account.getBalance();
        }
        else{
            System.out.println("Cannot get balance");
            scanner.close();
            return 0;
        }
    }

}
