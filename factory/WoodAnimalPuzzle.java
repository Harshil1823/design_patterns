package factory;
/**
 * Creates WoodAnimalPuzzle 
 * children of Puzzle class
 * @author - Harshil Shah
 */
public class WoodAnimalPuzzle extends Puzzle {

    /**
     * gives the variable Name in puzzle value(who created it)
     * gievs the variable Material in Puzzle value(what material it is)
     * Adds the pieces in ArrayList pieces
     */
    public WoodAnimalPuzzle() {
        this.name = "Animal Puzzle by Melissa and Doug";
        this.material = "wood";
        pieces.add("Horse");
        pieces.add("Sheep");
        pieces.add("dog");
        pieces.add("cat");
        pieces.add("cow");
        pieces.add("chicken");
    }
}
