package factory;

public class FisherPriceStore extends ToyStore{

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
