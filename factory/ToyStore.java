package factory;

public abstract class ToyStore {
    
    public String orderPuzzle(String type) {
        Puzzle puzzle = createPuzzle(type);

        return puzzle.assemble() + puzzle.boxPuzzle();
    }

    public abstract Puzzle createPuzzle (String type);


}