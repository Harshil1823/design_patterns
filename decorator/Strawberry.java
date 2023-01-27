package decorator;
/**
 * flavor Strawberry class
 * gives flavor variable value Strawberry
 * calls the parent (scoop decorator) method to Initialize
 * @author Harshil 
 */
public class Strawberry extends ScoopDecorator {

/**
 * /**
 * constructor 
 * gives flavor variable value chocolate
 * initializes iceCream falvor and numScoops
 * @param iceCream 
 * @param numScoops
 */
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        flavor = "Strawberry";
    }
    
}
