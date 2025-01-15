package exercises.chap3_ex2;

//singleton
public class GameWorld {
    private static GameWorld instance;
    private GameWorld(){}
    public static GameWorld getInstance(){
        if(instance==null){
            instance=new GameWorld();
        }
        return instance;
    }
    public void loadWorld(){
        System.out.println("Game World Loaded");
    }
}
