package factory;
/**
 * Creates plasticColorPuzzle 
 * children of Puzzle class
 * @author - Harshil Shah
 */
public class PlasticColorPuzzle extends Puzzle{
    /**
     * gives the variable Name in puzzle value(who created it)
     * gievs the variable Material in Puzzle value(what material it is)
     * Adds the pieces in ArrayList pieces
     */
    public PlasticColorPuzzle(){
        this.name = "Animal Puzzle by Fisher Price";
        this.material = "plastic";
        pieces.add("Green Dog");
        pieces.add("Orange Dog");
        pieces.add("Red Dog");
        pieces.add("Blue Dog");
        pieces.add("Yellow Dog");
        pieces.add("Brown Dog");


    }
}
