package factory;
/**
 * Creates plasticAnimalPuzzle 
 * children of Puzzle class
 * @author - Harshil Shah
 */
public class PlasticAnimalPuzzle extends Puzzle {
    /**
     * gives the variable Name in puzzle value(who created it)
     * gievs the variable Material in Puzzle value(what material it is)
     * Adds the pieces in ArrayList pieces
     */
    public PlasticAnimalPuzzle() {
        this.name = " Animal Puzzle by Fisher Price";
        this.material = "plastic";
        pieces.add("Fox");
        pieces.add("elephant");
        pieces.add("Giraffe");
        pieces.add("owl");
        pieces.add("Monkey");

    }
}
