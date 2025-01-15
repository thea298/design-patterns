package creational.abstractFactory;

public abstract class HotChocolate {
    public String inredients;

    public String getInredients() {
        return inredients;
    }

    public void setInredients(String inredients) {
        this.inredients = inredients;
    }
    
    public abstract void prepare();
}
