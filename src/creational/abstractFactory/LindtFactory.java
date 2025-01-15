package creational.abstractFactory;

public class LindtFactory extends ChocolateFactory{

    @Override
    public Chocolate createChocolate() {
        return new LindtChoc();
    }

    @Override
    public HotChocolate createHotChocolate() {
        return new LindtHotChocolate();
    }
    
}
