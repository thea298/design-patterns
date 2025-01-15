package behavioral.command;

import java.util.ArrayList;

//Invoker
public class Waiter {
    private ArrayList<Order> listOrders=new ArrayList<Order>();

    public void takeOrder(Order order){
        this.listOrders.add(order);
        System.out.println("Waiter is taking a new order "+order);
    }

    public void executeOrder(){
        for(Order order:this.listOrders)    order.execute();
    }
}
