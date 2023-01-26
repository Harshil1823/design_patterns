package decorator;

public abstract class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;

    public ScoopDecorator(IceCream iceCream, int numScoops){
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }

    public String toString(){
        return description + ", " + numScoops + " scoops of " + flavor + " ice cream";
    }

    public double getCost(){
        if(flavor.equals("Vanilla")){
            return flavorCost = 1.25 * numScoops;
        }else if(flavor.equals("Chocolate")){
            return flavorCost = 1.5 * numScoops;
        }else if(flavor.equals("Strawberry")){
            return flavorCost = 1.4 * numScoops;
        }else{
            return flavorCost;
        }
    }
}
