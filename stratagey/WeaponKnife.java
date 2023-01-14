package stratagey;
import java.util.Random;
/*
 * how WeaponKnife behaves and implements weaponBehavior interface
 * @author Harshil Shah
 */
public class WeaponKnife implements WeaponBehavior{

/*
 *  @returns action on how will the knife attack
 */
    @Override
    public String attack() {

        String[] statements = {"Slice with a knife",
                                "Jab with a knife",
                                "Sneak up on opponent with a knife"};
        Random rand = new Random();
        int index = rand.nextInt(statements.length); 
        return statements[index];
    }
    
}
