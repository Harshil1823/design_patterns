package stratagey;
public class Queen extends Character {

    public Queen (String name){
        super(name);
        weaponBehavior = new WeaponKnife();

    }

    public String toString(){
        return name + " is a beautiful queen" ;
    }

}
