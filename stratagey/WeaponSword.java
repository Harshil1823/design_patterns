package stratagey;
import java.util.Random;
/*
 * 
 * how WeaponSowrd behaves and implements weaponBehavior interface
 * @author Harshil Shah
 */
public class WeaponSword implements WeaponBehavior {
    
/*
 *  *  @returns action on how will the sword attack
 */
    @Override
    public String attack() {

        String[] statements = {"Lunge and strike with sword",
                                "Fancy turn and slice with sword",
                                "Jam opponents blade with sword"};
        Random rand = new Random();
        int index = rand.nextInt(statements.length); 
        return statements[index];
    }
    
}
