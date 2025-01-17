package exam2;


//comcrete strategy
public class FixedDiscount implements Discount{
    private double discount;

    public FixedDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double amount) {   
        return amount-discount;
    }

}