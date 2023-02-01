package factory;

import java.util.ArrayList;

public abstract class Puzzle {

    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<String>();


    public String assemble () {
        String result = "putting to gether a " + name + 
                "\nthis puzzle is made out of " + material + "\n";
        
        for(String piece : pieces){
            result += "- " + piece + "\n";
        }
        return result;
    }

    public String boxPuzzle () {
        return "putting the " + name + "in the box";
    }
    
}
