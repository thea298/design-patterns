package exam1;

public class NormalOrderFactory extends OrderFactory {

    @Override
    public Order createOrder(FoodItem foodItem, int quantity) {
        return new NormalOrder(foodItem);
    }
    
}
