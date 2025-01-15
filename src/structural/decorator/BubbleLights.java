package structural.decorator;

//concrete decorator
public class BubbleLights extends TreeDecorator{
    public BubbleLights(ChristmasTree tree){
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate()+decorateWithBL();
    }

    private String decorateWithBL(){
        return " with bubble lights";
    }
}
