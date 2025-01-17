package exam;

public class NormalOrderFactory extends OrderFactory1 {

    @Override
    public Order createOrder(FoodItem foodItem, int quantity) {
        return new NormalOrder(foodItem);
    }
    
}
