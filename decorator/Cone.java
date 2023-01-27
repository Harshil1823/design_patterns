package decorator;
/**
 * gets description of ConeType
 * and the cost of a special coneType 
 * @author Harshil Shah
 */
public class Cone extends IceCream {

    private ConeType coneType;

/**
* constructor, initializes instance variable
* @param coneType gives description variable value(what type of cone it is)
*e.g Sugar_cone, Waffle_Cone etc..
*/
    public Cone (ConeType coneType){
        this.coneType = coneType;
        if(coneType == coneType.SUGAR_CONE){
            this.description = "Sugar cone";
        }else if(coneType == coneType.WAFFLE_CONE){
            this.description = "Waffle cone";
        }else if(coneType == coneType.PRETZEL_CONE){
            this.description = "Pretzel cone";
        }else if(coneType == coneType.CHOCOLATE_DIPPED_CONE){
            this.description = "Chocolate dipped Cone";
        }
    }
/**
 * calculates price for each different coneType
 * @return cost of specific conetype
 */
    public double getCost() {

        double tempNum = 0.0;
        
        if(coneType == coneType.SUGAR_CONE){
            return tempNum = tempNum + .75;
        }else if(coneType == coneType.WAFFLE_CONE){
            return tempNum = tempNum + 1.2;
        }else if(coneType == coneType.PRETZEL_CONE){
            return tempNum = tempNum + 1.8;
        }else if(coneType == coneType.CHOCOLATE_DIPPED_CONE){
            return tempNum = tempNum + 1.5;
        }else{
            return tempNum;
        }
    }
    
}
