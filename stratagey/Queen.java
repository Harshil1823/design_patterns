package stratagey;
/*
 * Character Queen extends class character
 * @author Harshil Shah
 */
public class Queen extends Character {
/*
 * Constructor 
 * @param name -- calls the method in parent class and sets the value
 * gives weapon behavior(WeaponKnife)
 */
    public Queen (String name){
        super(name);
        weaponBehavior = new WeaponKnife();

    }
/*
 * @return name + is a beautiful knig
 */
    public String toString(){
        return name + " is a beautiful queen" ;
    }

}
