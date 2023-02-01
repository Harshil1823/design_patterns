package factory;
/**
 * Class that contains Orderpuzzle and 
 * CreatePuzzle methods
 * @author Harshil Shah
 */
public abstract class ToyStore {

    /**
     * 
     * @param type - uses type and creates puzzle of that type
     * @return - calls assemble and boxpuzzle method in class Puzzle 
     */
    public String orderPuzzle(String type) {
        Puzzle puzzle = createPuzzle(type);

        return puzzle.assemble() + puzzle.boxPuzzle();
    }

    /**
     * abstract method so childrens have to implement it
     * @param type - makes a puzzle of specific type
     * e.g animal, color, and others
     * @return - returns nothing
     */
    public abstract Puzzle createPuzzle (String type);


}