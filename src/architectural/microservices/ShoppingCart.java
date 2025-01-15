package architectural.microservices;

public class ShoppingCart {

    public void addProduct(String productName){
        System.out.println("Adding product: "+productName);
    }
    
    public void removeProduct(String productName){
        System.out.println("Removing product: "+productName);
    }
    
}