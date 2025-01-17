package exam;

public class BulkOrderFactory extends OrderFactory1{

    @Override
    public Order createOrder(FoodItem foodItem, int quantity) {
        return new BulkOrder(foodItem, quantity);
    }
    
}
