package architectural.microservices;

public class ShoppingApp {
    public static void main(String[] args) {
        Catalog catalog=new Catalog();
        ShoppingCart cart=new ShoppingCart();
        Discount discount=new Discount();
        Ordering ordering=new Ordering();

        catalog.searchByProduct("laptop");
        cart.addProduct("lenovo");
        discount.applyDiscount("10%");
        ordering.pay();
    }
}
