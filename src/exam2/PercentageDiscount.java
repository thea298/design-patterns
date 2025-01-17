package exam2;

//concrete strategy
public class PercentageDiscount implements Discount{
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double amount) {   
        return amount*(1-percentage);
    }


}
