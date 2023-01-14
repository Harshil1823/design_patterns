package stratagey;
/*Character class of King extends the character class
 * @author Harshil Shah
 */
public class King extends Character{
/*
 * Constructor 
 * @param name -- calls the method in parent class and sets the value
 * gives weapon behavior(weaponSword)
 */
    public King(String name){
        super(name);
        weaponBehavior = new WeaponSword();

    }
/*
 * @return - name of the king and is a nobel king
 */
    public String toString(){
        return name + " is a nobel king" ;
    }
}
