package architectural.mvcExample;

public class BankAccountView {
    
    public void displayAccountDetails(String accountHolder, double balance){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public void displayMessage (String message){
        System.out.println(message);
    }
}