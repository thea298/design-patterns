package creational.builder;

public class Calzone extends PizzaBuilder{

    @Override
    public void buildDough() {
        pizza.setDough("thick");
    }

    @Override
    public void buildSauce() {
        pizza.setDough("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setDough("cheese + pepperoni");
    } 
    
}
