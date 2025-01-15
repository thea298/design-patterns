package behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper("L'orient le jour");
        newspaper.addTypeOfNews("sports"); 
        newspaper.addTypeOfNews("travel");

        Subscriber s1 = new IndividualSubscriber("Yara Eslim");
        Subscriber s2 = new OrganizationSubscriber("UL");

        newspaper.subscribe(s2, "sports");
        newspaper.subscribe(s2, "travel");
        newspaper.subscribe(s1, "sports");

        newspaper.notify("sports", "2034 world cup in saudi arabiaa maannnn!!!!");
    }
}
