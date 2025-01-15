package exercises.chap3_ex1;

public class Client {
    public static void main(String[] args) {
        Bank b=new PersonalService();
        Account acc=b.createCheckingsAccount("thea", 10000);
        acc.printSummary();
    }
}
