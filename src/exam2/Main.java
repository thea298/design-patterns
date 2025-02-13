package exam2;

public class Main {
    public static void main(String[] args) {
        Bookstore bookstore=new Bookstore();
        bookstore.addBook("Persepolis", "M.S", 20, 5);
        bookstore.addBook("Percy Jackson", "R.G", 12, 5);
        Customer customer=new Customer("Maria Sfeir", "maria@gmail.com", "09876543");
        Book book=bookstore.searchBook("Persepolis");
        bookstore.buy(book, new PercentageDiscount(0.12));
        bookstore.buy(book, new PercentageDiscount(0.4));
        bookstore.buy(book, new PercentageDiscount(0.2));
        bookstore.buy(book, new FixedDiscount(6));
        bookstore.buy(book, null);
        bookstore.buy(book, new PercentageDiscount(0.2));
        bookstore.subscribe(book, customer);
        bookstore.notify(book);
    }
}
