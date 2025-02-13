package creational.builder;

public class Marguerita extends PizzaBuilder{

    @Override
    public void buildDough() {
        pizza.setDough("thin");         
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("tomato");         
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("cheese + oregano");                 
    }

}