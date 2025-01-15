package structural.composite;

public class Demo {
    public static void main(String[] args) {
        Item item1=new Product("shoes", 25);
        Item item2=new Product("pants", 45);
        Item box1=new Box("clothes");
        box1.addItem(item1);
        box1.addItem(item2);

        Item item3=new Product("table", 10);
        Item box2=new Box("furniture");

        box2.addItem(item3);
        box2.addItem(box1);
        System.out.println(box2.calculatePrice());
        box2.print();
    }
}
