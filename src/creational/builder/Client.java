package creational.builder;

public class Client {
    public static void main(String[] args) {
        Waiter waiter=new Waiter();
        PizzaBuilder pizzaBuilder=new Marguerita();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.preparePizza();
        waiter.returnPizza();
    }
}
