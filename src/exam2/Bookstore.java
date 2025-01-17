package exam2;

import java.util.*;

//publisher
public class Bookstore {
    private HashMap<Integer, Book> books=new HashMap<Integer, Book>();
    private HashMap<Integer, List<Customer>> subscribers=new HashMap<Integer, List<Customer>>();

    public void addBook(String title, String author, double price, int quantity){
        Book b=new Book(title, author, price, quantity);
        books.put(b.getId(), b);
    }

    public void subscribe(Book b, Customer c){
        List<Customer> list=subscribers.get(b.getId());
        if(list==null){
            list=new ArrayList<Customer>();
            subscribers.put(b.getId(), list);
        }
        list.add(c);
    }

    public void unsubscribe(Book b, Customer c){
        List<Customer> list=subscribers.get(b.getId());
        if(list==null){
            System.out.println("Unavailable, no subscriptions");
        }
        list.remove(c);
    }

    public void notify(Book b){
        List<Customer> list=subscribers.get(b.getId());
        for(Customer c:list){
            c.update(b);
        }
    }

    public Book searchBook(String title){
        for(Book b:books.values()){
            if(b.getTitle().equalsIgnoreCase(title));
            return b;
        }
        System.out.println("Unavailable, "+title+" does not exist");
        return null;
    }

    public void buy(Book b, Discount discount){
        if(b.getStock_qty()==0){
            System.out.println("Book unavailable");
            return;
        }
        b.setStock_qty(b.getStock_qty()-1);
        double total=b.getPrice();
        if(discount!=null){
            total=discount.applyDiscount(b.getPrice());
        }
        System.out.println("Your total is "+total);
    }

}