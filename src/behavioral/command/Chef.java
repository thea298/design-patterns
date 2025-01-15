package behavioral.command;

//Receiver
public class Chef {

    public void prepItalian(){
        System.out.println("Chef is preparing italian menu");
    }
    
    public void prepSushi(){
        System.out.println("Chef is preparing sushi menu");
    }

    @Override
    public String toString() {
        return "Chef Thea";
    }
    
}
