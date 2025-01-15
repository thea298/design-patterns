package exercises.chap3_ex2;

public class Main {
    public static void main(String[] args) {
        GameWorld game=GameWorld.getInstance();
        game.loadWorld();

        WeaponFactory factory=new WeaponFactory();
        Weapon sword=factory.createWeapon("sword");
        Weapon bow=factory.createWeapon("bow");
        sword.attack();
        bow.attack();

        CharacterBuilder builder=new CharacterBuilder();
        
        builder.reset();
        builder.buildName("Archer");
        builder.buildHealth(100);    
        builder.buildArmor(45);
        builder.buildWeapon(bow);  
        Character archer=builder.getCharacter();
        System.out.println(archer); 
        builder.reset();
        builder.buildName("Warrior");
        builder.buildHealth(70);    
        builder.buildArmor(65);
        builder.buildWeapon(sword);  
        Character warrior=builder.getCharacter();
        System.out.println(warrior);  
    }
}
