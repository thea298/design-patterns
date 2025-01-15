package behavioral.strategy;

public class ByBus implements Strategy{

    @Override
    public void execute(String destination) {
        System.out.println("Bade enzal w redele l miyye!! "+destination);        
    }
    
}
