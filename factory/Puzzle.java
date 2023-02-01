package factory;
/**
 * @author Harshil Shah
 * abstract class so the children must extend it and have access to it's attributes
 */
import java.util.ArrayList;

public abstract class Puzzle {

    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<String>();

/**
 * String 
 * @return - returns name of the puzzle, material, and what pieces
 * it contains
 */
    public String assemble () {
        String result = "putting to gether a " + name + 
                "\nthis puzzle is made out of " + material + "\n"
                + "adding the following pieces\n";
        
        for(String piece : pieces){
            result += "- " + piece + "\n";
        }
        return result;
    }
/**
 * packs up whatever puzzle we just created 
 * and prints that to the user
 * @return - String putting NAME in the box
 */
    public String boxPuzzle () {
        return "putting the " + name + "in the box";
    }
    
}
