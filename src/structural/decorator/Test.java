package structural.decorator;

public class Test {
    public static void main(String[] args) {
        //ChristmasTree tree=new Garland(new BubbleLights(new ChristmasTreeImplementation()));
        ChristmasTree tree=new ChristmasTreeImplementation();
        ChristmasTree tree1=new BubbleLights(tree);
        ChristmasTree tree2=new Garland(tree1);
        System.out.println(tree2.decorate());
    }
}
