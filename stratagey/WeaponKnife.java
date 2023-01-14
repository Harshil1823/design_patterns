package stratagey;
import java.util.Random;

public class WeaponKnife implements WeaponBehavior{

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
