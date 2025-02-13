package exam1;

public abstract class OrderFactory {
    
    //Factory method
    public abstract Order createOrder(FoodItem foodItem, int quantity);

}
