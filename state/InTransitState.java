package state;
/**
 * @author - Harshil Shah
 */
public class InTransitState extends State {
    private int days;
    /**
     * calls the constructor in parent class (state)
     * @param pkg - sets pkg equal to package
     * @param quantity - sets quantity equal to data member quanttity
     * sets the days data member to 5. Because it's in transit
     */
    public InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
        this.days = 5;
    }
    /**
     * returns string - the package name and tells that it's out for delivery 
     * depending on it's verb
     */
    public String getStatus() {
        String temp = getVerb("is", "are");
        return "The " + pkg.getName() + " " + temp + " out for delivery";
    }
    /**
     * returns string - package name and how long will it take the 
     * package to arrive
     */
    public String getETA() {
        return "The " + pkg.getName() + " should arrive within " + days + " days";
    }
    /**
     * increaments the days by 3
     * and returns string - package has experienced a delay
     * in shipping
     */
    public String delay() {
        days += 3;
        String temp = getVerb("has", "have");
        return "The " + pkg.getName() + " " + temp + " experienced a dealy in shipping";
    }
}
