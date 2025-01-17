package exam;

public class OrderFactory {
    
    //Factory method
    public Order createOrder(FoodItem foodItem, int quantity){
        if(quantity == 1){
            return new NormalOrder(foodItem);
        }
        else if(quantity > 1){
            return new BulkOrder(foodItem, quantity);
        }
        return null;
    }

}
