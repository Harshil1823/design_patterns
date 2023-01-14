package stratagey;
import java.util.Random;
/*How weaponAxe behaves and implements weaponBehavior interface
 * @author Harshil Shah
 */
public class WeaponAxe implements WeaponBehavior {

    String[] statements = {"Swing an axe", "Twirl with an axe"};
/*
 * @returns action on how will the axe attack
 */
    @Override
    public String attack() {
        Random rand = new Random();
        int index = rand.nextInt(statements.length); 
        return statements[index]; 
    }
    
}
