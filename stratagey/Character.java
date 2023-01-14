package stratagey;
/*abstract Character class gives character name and there weapon behavior
 * @author Harhsil Shah
 */
public abstract class Character {
    
    protected String name;
    WeaponBehavior weaponBehavior;

/*
 * @param name -- gvies the character name
 * gives appropriate value to the variable name 
 */
    //constructor 
    public Character(String name){
        this.name = name;
    }
 /*
  * @returns weaponBehavior with a type of attack
  */
    public String attack(){
       return weaponBehavior.attack();
    }
/*
 * @param wb -- doesn't do anything
 */
    public void setWeaponBehavior(WeaponBehavior wb){

    }
/*
 * @retrun toString method
 */
    public abstract String toString();
}
