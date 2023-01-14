package stratagey;
/*Character Knight extends class character
 * @author Harshil Shah
 */
public class Knight extends Character {

/*
 * Constructor 
 * @param name -- calls the method in parent class and sets the value
 * gives weapon behavior(weaponBow)
 */
    public Knight(String name){
        super(name);
        weaponBehavior = new WeaponBow();

    }
/*
 * @return name + is a valiant knight
 */
    public String toString(){
        return name + " is a valiant knight" ;
    }
}
