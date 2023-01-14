package stratagey;
/*Troll class extends Character as well
 * @author Harshil Shah
 */
public class Troll extends Character{
/*
 * *
 * Constructor 
 * @param name -- calls the method in parent class and sets the value
 * gives weapon behavior(WeaponKnife)
 */
    public Troll(String name) {
        super(name);
        weaponBehavior = new WeaponAxe();

    }
/*
 * @return name + is a funny troll
 */
    public String toString(){
        return name + " is a funny troll" ;
    }
}
