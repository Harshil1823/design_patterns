package stratagey;
import java.util.Random;
/*
 * how WeaponNone behaves and implements weaponBehavior interface
 * @author Harshil Shah
 */
public class WeaponNone implements WeaponBehavior {
/*
 *  @returns action on how will not having any weapon react
 */
    @Override
    public String attack() {

        String[] statements = {"Oh no, I lost my weapon",
                                "No one let's me have a weapon"};
        Random rand = new Random();
        int index = rand.nextInt(statements.length); 
        return statements[index];
    }
    
}
