package behavioral.observer;

import java.util.*;

public class Newspaper {
    private String name;
    /*private List<Subscriber> frenchEdition;
    private List<Subscriber> englishEdition;
    private List<Subscriber> kidsEdition;
    private List<Subscriber> sportEdition;
    key = type of news (String)
    Value = list of subscribers for a specific type of news (List<Subscriber>)*/

    private Map<String, List<Subscriber>> ListsSubscribers;

    public Newspaper(String name) {
        this.name = name;
        this.ListsSubscribers = new HashMap<String, List<Subscriber>>();
    }
    
    public void addTypeOfNews(String typeOfNews){
        this.ListsSubscribers.put(typeOfNews, new ArrayList<Subscriber>());
        //adding a new empty list of subscribers for typeOfNews
    }
    
    public void subscribe(Subscriber subscriber, String typeOfNews){
        List<Subscriber> list = this.ListsSubscribers.get(typeOfNews);
        if(list == null){
            System.out.println(typeOfNews + " does not exist. Cannot subscribe!");
            return;
        }
        list.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber, String typeOfNews){
        List<Subscriber> list = this.ListsSubscribers.get(typeOfNews);
        if(list == null){
            System.out.println(typeOfNews + " does not exist. Cannot unsubscribe!");
            return;
        }
        list.remove(subscriber);
    }

    public void notify(String typeOfNews, String news){
        List<Subscriber> list = this.ListsSubscribers.get(typeOfNews);
        if(list == null){
            System.out.println(typeOfNews + " does not exist. Cannot notify!");
            return;
        }
        for(Subscriber s : list){
            s.update(news); 
        }
    }
}
