package architectural.microservices;

public class Catalog {

    public void browseProduct(){
        System.out.println("browsing product");
    }

    public void searchByProduct(String productName){
        System.out.println("searching for product: "+productName);
    }

    public void searchByCategory(String categoryName){
        System.out.println("searching for category: "+categoryName);
    }
    
}