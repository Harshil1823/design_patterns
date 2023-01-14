package stratagey;
import java.util.Random;


public class WeaponBow implements WeaponBehavior {

    @Override
    public String attack() {

        String[] statements = {"Draw and loose an arrow",
                                "Shoot arrow high in the sky"};
        Random rand = new Random();
        int index = rand.nextInt(statements.length); 
        return statements[index];
    }
    
}
