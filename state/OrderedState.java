package state;
/**
 * @author - Harshil Shah
 */
public class OrderedState extends State{
    private int days;
    /**
     * calls the constructor in parent class (state)
     * @param pkg - sets pkg equal to package
     * @param quantity - sets quantity equal to data member quanttity
     * sets the days data member to 2. Because it's just ordered
     */
    public OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);
        this.days = 2;
    }
     /**
     * returns string - the package name and tells that it's ordered
     * depending on it's verb
     */
    public String getStatus() {
        String temp = getVerb("was", "were");
        return "The " + pkg.getName() + " " + temp + " ordered";
    }
     /**
     * returns string - package name and how long will it take the package
     * to be shipped 
     */
    public String getETA() {
        return "The " + pkg.getName() + " will be shipped within " + days + " business days";
    }
    /**
     * increaments the days by 2
     * returns string - pacakage name and it has experienced a slight delay in 
     * manugacturing
     */
    public String delay() {
        days += 2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing.";
    }
}
