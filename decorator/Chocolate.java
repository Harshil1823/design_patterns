package decorator;
/**
 * flavor chocolate class
 * gives flavor variable value chocolate
 * calls the parent (scoop decorator) method to Initialize
 * @author Harshil 
 */
public class Chocolate extends ScoopDecorator {

/**
 * constructor 
 * gives flavor variable value chocolate
 * initializes iceCream falvor and numScoops
 * @param iceCream 
 * @param numScoops
 */
    public Chocolate(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        flavor = "Chocolate";
        flavorCost = 1.5 * numScoops;
    }
    
}
