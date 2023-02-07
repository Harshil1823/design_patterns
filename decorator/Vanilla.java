package decorator;
/**
 * flavor Strawberry class
 * gives flavor variable value Strawberry
 * calls the parent (scoop decorator) method to Initialize
 * @author Harshil 
 */

public class Vanilla extends ScoopDecorator{
/**
 * constructor 
 * gives flavor variable value Vanilla
 * initializes iceCream falvor and numScoops
 * @param iceCream
 * @param numScoops
 */
    public Vanilla(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        flavor = "Vanilla";
        flavorCost = 1.25 * numScoops;
    }
    
}
