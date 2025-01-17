package exam2;

public class Book {
    private String title, author;
    private double price;
    private int id, stock_qty;
    private static int count=0;

    public Book(String title, String author, double price, int stock_qty) {
        this.id=++count;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock_qty = stock_qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock_qty() {
        return stock_qty;
    }

    public void setStock_qty(int stock_qty) {
        this.stock_qty = stock_qty;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + ", stock_qty=" + stock_qty + "]";
    }
    
}