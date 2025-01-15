package behavioral.template;

public abstract class OnlineOrdering {
    //template method
    public void purchase(){
        //define order of steps
        this.selectItems();
        this.addToCart();
        this.pay();
    }
    //step1
    public abstract void selectItems();
    //step2
    public void addToCart(){
        System.out.println("adding to cart");
    }
    //step3
    public void pay(){
        System.out.println("paying by credit card");
    }

}