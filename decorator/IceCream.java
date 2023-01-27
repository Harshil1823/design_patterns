package decorator;
/**
 * IceCream class (parent) with
 * String Description variable for description of IceCream
 * @author Harshil Shah
 */
public abstract class IceCream {
    protected String description;
/**
 * toString method that returns description
 * @return String 
 */
    public String toString(){
        return description;
    }
/**
 * abstract method forces children to inherit it
 * @return - Toal cost of icecream
 */
    public abstract double getCost();
}
