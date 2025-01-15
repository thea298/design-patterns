package creational.factoryMethod;

public class PoulainFactory extends ChocolateFactory{

    @Override
    public Chocolate createChocolate() {
        return new PoulainChoc();
    }
    
}
