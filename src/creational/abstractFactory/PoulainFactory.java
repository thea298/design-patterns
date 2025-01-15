package creational.abstractFactory;

public class PoulainFactory extends ChocolateFactory{

    @Override
    public Chocolate createChocolate() {
        return new PoulainChoc();
    }

    @Override
    public HotChocolate createHotChocolate() {
        return new PoulainHotChocolate();
    }
    
}
