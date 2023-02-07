package decorator;
/**
 * Extends IceCream and contains methods
 * such as: toString, getCost 
 * @author - Harshil Shah
 */
public abstract class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;
/**
 * constructor, only for initializes
 * @param iceCream - gives the iceCream flavor
 * @param numScoops - gives the value of how many scoops
 */
    public ScoopDecorator(IceCream iceCream, int numScoops){
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }
/**
 * Prints a different message depending on numScoops
 * @return String/message
 */
    public String toString(){
        if(numScoops == 1){
            return iceCream.toString() + ", " + " a scoops of " + flavor + " ice cream";
        }else{
            return iceCream.toString() + ", " + numScoops + " scoops of " + flavor + " ice cream";
        }
    }

/**
 * Adds total to the price depending on 
 * what flavor iceCream you chose
 * @return - Total cost of the icecream
 */
    public double getCost(){
        if(flavor.equals("Vanilla")){
            // flavorCost = 1.25 * numScoops;
            return iceCream.getCost() + flavorCost ;
        }else if(flavor.equals("Chocolate")){
            // flavorCost = 1.5 * numScoops;
            return iceCream.getCost() + flavorCost ;
        }else if(flavor.equals("Strawberry")){
            // flavorCost = 1.4 * numScoops;
            return iceCream.getCost() + flavorCost ;
        }else{
            return iceCream.getCost() ;
        }
    }
}
