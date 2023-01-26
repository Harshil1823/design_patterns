package decorator;

public class Cone extends IceCream {

    private ConeType coneType;

    public Cone (ConeType coneType){
        this.coneType = coneType;

        if(coneType.equals("SUGAR_CONE")){
            this.description = "Sugar cone";
        }else if (coneType.equals("WAFFLE_CONE")){
            this.description = "Waffle cone";
        }else if (coneType.equals("PRETZEL CONE")){
            this.description = "Pretzel cone";
        }else if ( coneType.equals("CHOCOLATE_DIPPED_CONE")){
            this.description = "Chocolate Dipped Cone";
        }
        
    }
    public double getCost() {

        double tempNum = 0.0;
        if(coneType.equals("SUGAR_CONE")){
            return tempNum = tempNum + .75;
        }else if (coneType.equals("WAFFLE_CONE")){
            return tempNum = tempNum + 1.2;
        }else if (coneType.equals("PRETZEL CONE")){
            return tempNum = tempNum + 1.8;
        }else if ( coneType.equals("CHOCOLATE_DIPPED_CONE")){
            return tempNum = tempNum + 1.5;
        }else{
            return tempNum;
        }
    }
    
}
