package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

//composite
public class Box implements Item{
    private ArrayList<Item> items=new ArrayList<Item>();
    private String name;

    public Box(String name) {
        this.name = name;
    }

    @Override
    public double calculatePrice() {
        double total=0;
        for(Item i:this.items){
            total+=i.calculatePrice();
        }
        return total;
    }

    @Override
    public void addItem(Item item) {
        this.items.add(item);
    }
    
    @Override
    public void removeItem(Item item) {
        if(this.items.contains(item))   this.items.remove(item);        
    }
    
    @Override
    public void print() {
        System.out.println("Box [name="+name);
        Iterator<Item> iterator=this.items.iterator();
        while(iterator.hasNext()){
            Item item=iterator.next();
            item.print();
        }
        System.out.println("]");
    }

}
