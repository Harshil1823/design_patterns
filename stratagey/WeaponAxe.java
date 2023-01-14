package stratagey;
import java.util.Random;

public class WeaponAxe implements WeaponBehavior {

    String[] statements = {"Swing an axe", "Twirl with an axe"};

    @Override
    public String attack() {
        Random rand = new Random();
        int index = rand.nextInt(statements.length); 
        return statements[index]; 
    }
    
}
