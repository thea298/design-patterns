package creational.factoryMethod;

public class LindtFactory extends ChocolateFactory{

    @Override
    public Chocolate createChocolate() {
        return new LindtChoc();
    }
    
}
