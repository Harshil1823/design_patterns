package stratagey;
public class Troll extends Character{

    public Troll(String name) {
        super(name);
        weaponBehavior = new WeaponAxe();

    }
    public String toString(){
        return name + " is a funny troll" ;
    }
}
