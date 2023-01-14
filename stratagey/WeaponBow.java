package stratagey;
import java.util.Random;
/*
 * how WeaponBow behaves and implements weaponBehavior interface
 * @author Harshil Shah
 */

public class WeaponBow implements WeaponBehavior {
/*
*  * @returns action on how will the bow attack
*/
    @Override
    public String attack() {

        String[] statements = {"Draw and loose an arrow",
                                "Shoot arrow high in the sky"};
        Random rand = new Random();
        int index = rand.nextInt(statements.length); 
        return statements[index];
    }
    
}
