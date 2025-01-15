package exercises.chap3_ex2;

public class WeaponFactory {
    public Weapon createWeapon(String type){
        switch(type.toLowerCase()){
            case "sword":
                return new Sword();
            case "bow":
                return new Bow();
            default:
                throw new IllegalArgumentException("unknown weapon type"+type);
        }
    }
}
