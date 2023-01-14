package stratagey;
import java.util.Random;

public class WeaponNone implements WeaponBehavior {

    @Override
    public String attack() {

        String[] statements = {"Oh no, I lost my weapon",
                                "No one let's me have a weapon"};
        Random rand = new Random();
        int index = rand.nextInt(statements.length); 
        return statements[index];
    }
    
}
