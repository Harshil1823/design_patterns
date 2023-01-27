package decorator;
/**
 * Gives iceCream in bowl
 * gives Description variable valye "bowl"
 * @author Harshil Shah
 */
public class Bowl extends IceCream {

/**
 * Constructor gives
 * description variable bowl
 */
    public Bowl(){
        this.description = "Bowl";
    }

/**
 * @return 0 because bowl is ALWAYS FREE
 * OR SHOULD BE LOL
 */
    public double getCost() {
        return 0; //cost is $0
    }

}
