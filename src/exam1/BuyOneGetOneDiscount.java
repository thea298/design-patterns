package exam1;

public class BuyOneGetOneDiscount implements DiscountStrategy{
    
    @Override
    public double applyDiscount(double amount) {
        System.out.println("Doubling the number of your items");
        return amount;
    }
}
