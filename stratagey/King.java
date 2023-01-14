package stratagey;
public class King extends Character{

    public King(String name){
        super(name);
        weaponBehavior = new WeaponSword();

    }
    public String toString(){
        return name + " is a nobel king" ;
    }
}
