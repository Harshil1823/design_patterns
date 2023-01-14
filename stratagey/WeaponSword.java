package stratagey;
import java.util.Random;

public class WeaponSword implements WeaponBehavior {

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
