package factory;

public class MelissaAndDougStore extends ToyStore {

    @Override
    public Puzzle createPuzzle(String type) {

        if(type.equalsIgnoreCase("color")){
            return new WoodColorPuzzle();
        }else if(type.equalsIgnoreCase("animal")){
            return new WoodAnimalPuzzle();
        }else{
            return null;
        }
    }
    
}
