package behavioral.strategy;

public class ByBike implements Strategy{

    @Override
    public void execute(String destination) {
        System.out.println("By bike to "+destination);        
    }

}
