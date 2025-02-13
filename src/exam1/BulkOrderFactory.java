package exam1;

public class BulkOrderFactory extends OrderFactory{

    @Override
    public Order createOrder(FoodItem foodItem, int quantity) {
        return new BulkOrder(foodItem, quantity);
    }
    
}
