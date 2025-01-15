package structural.proxy;

public class Demo {
    public static void main(String[] args) {
        BankAccount bankAccount = new ProxyBA(new RealBA(100), "kherye");
        bankAccount.deposit(34);
        System.out.println(bankAccount.getBalance());
    }
}