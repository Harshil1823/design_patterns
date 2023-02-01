package factory;
/**
 * Creates WoodColorPuzzle 
 * children of Puzzle class
 * @author - Harshil Shah
 */
public class WoodColorPuzzle extends Puzzle{
    
    /**
     * gives the variable Name in puzzle value(who created it)
     * gievs the variable Material in Puzzle value(what material it is)
     * Adds the pieces in ArrayList pieces
     */
    public WoodColorPuzzle(){
        this.name = "Animal Puzzle by Melissa and Doug";
        this.material = "wood";
        pieces.add("Red Fish");
        pieces.add("Yellow Fish");
        pieces.add("Green Fish");
        pieces.add("Purple Fish");
        pieces.add("pink Fish");
        pieces.add("orange Fish");
        pieces.add("Brown Fish");
        pieces.add("white Fish");
        pieces.add("black Fish");


    }
}
