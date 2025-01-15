package behavioral.command;

public class SushiOrder implements Order{
    private Chef chef;    

    public SushiOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.prepSushi();        
    }

    @Override
    public String toString() {
        return "SushiOrder by " + chef;
    }
    
}
