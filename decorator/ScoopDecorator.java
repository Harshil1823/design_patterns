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
        if(numScoops == 1){
            return iceCream.toString() + ", " + "a scoops of " + flavor + " ice cream";
        }else{
            return iceCream.toString() + ", " + numScoops + " scoops of " + flavor + " ice cream";
        }
    }

    public double getCost(){
        if(flavor.equals("Vanilla")){
            flavorCost = 1.25 * numScoops;
            return iceCream.getCost() + flavorCost ;
        }else if(flavor.equals("Chocolate")){
            flavorCost = 1.5 * numScoops;
            return iceCream.getCost() + flavorCost ;
        }else if(flavor.equals("Strawberry")){
            flavorCost = 1.4 * numScoops;
            return iceCream.getCost() + flavorCost ;
        }else{
            return iceCream.getCost() ;
        }
    }
}
