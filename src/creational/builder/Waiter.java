package creational.builder;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder=pizzaBuilder;
    }
    public Pizza returnPizza(){
        return this.pizzaBuilder.getResult();
    }
    public void preparePizza(){
        pizzaBuilder.createPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
    public void preparePizzaWithoutSauce(){
        pizzaBuilder.createPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildTopping();
    }
}
