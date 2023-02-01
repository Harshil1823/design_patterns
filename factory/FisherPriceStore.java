package factory;
/**
 * children for ToyStore class
 * @author Harshil Shah
 */
public class FisherPriceStore extends ToyStore{

    /**
     * @return - creates new type of puzzle that needs to be created
     * @param type - so we can compare what color or animal puzzle needs to be created
     */
    @Override
    public Puzzle createPuzzle(String type) {

        if(type.equalsIgnoreCase("color")){
            return new PlasticColorPuzzle();
        }else if(type.equalsIgnoreCase("animal")){
            return new PlasticAnimalPuzzle();
        }else{
            return null;
        }
    }
    
     
}
