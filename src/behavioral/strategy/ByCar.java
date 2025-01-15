package behavioral.strategy;

public class ByCar implements Strategy{

    @Override
    public void execute(String destination) {
        System.out.println("By car to "+ destination);        
    }
    
}
