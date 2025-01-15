package creational.builder;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public void createPizza(){
        pizza=new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();

    public Pizza getResult(){
        return pizza;
    }
}
