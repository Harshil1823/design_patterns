package stratagey;
public abstract class Character {
    
    protected String name;
    WeaponBehavior weaponBehavior;

    //constructor 
    public Character(String name){
        this.name = name;
    }
    public String attack(){
       return weaponBehavior.attack();
    }
    public void setWeaponBehavior(WeaponBehavior wb){

    }
    public abstract String toString();
}
