package behavioral.template;

public class Client {
    public static void main(String[] args) {
        OnlineOrdering online=new GroceriesOrdering();
        online.purchase();

        online=new ClothingOrdering();
        online.purchase();
    }
}
