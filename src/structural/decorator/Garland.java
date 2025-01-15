package structural.decorator;

public class Garland extends TreeDecorator{
    public Garland(ChristmasTree tree){
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate()+this.decorateWithGarland();
    }

    private String decorateWithGarland(){
        return " with garland";
    }

}
