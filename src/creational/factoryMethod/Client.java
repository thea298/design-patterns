package creational.factoryMethod;

public class Client {
    
    public static void main(String[] args) {
        ChocolateFactory factory = new PoulainFactory();
        Chocolate chocolate = factory.createChocolate();
        chocolate.eat();

        ChocolateFactory factory1 = new LindtFactory();
        Chocolate chocolate1 = factory1.createChocolate();
        chocolate1.eat();
    }
}
