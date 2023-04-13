package state;
/**
 * @author - Harshil Shah
 */
public class DeliveredState extends State {
    private int days;
    /**
     * calls the constructor in parent class (state)
     * @param pkg - sets pkg equal to package
     * @param quantity - sets quantity equal to data member quanttity
     */
    public DeliveredState(Package pkg, int quantity) {
        super(pkg, quantity);
        this.days = 0;
    }
    /**
     * 
     * @return - returns the package name and says 
     * that it's here for you 
     */
    public String getStatus() {
        String temp = getVerb("is", "are");
        return "The " + pkg.getName() + " " + temp + " here for you";
    }
    /**
     * 
     * @return - returns the package name and says that it's 
     * here. Because it's delivered. 
     */
    public String getETA() {
        String temp = getVerb("is", "are");
        return "The " + pkg.getName() + " " + temp + " here";
    }
    /**
     * can't be delayed since it's already delivered
     * @return - that it's already been delivered
     */
    public String delay() {
        String temp = getVerb("has", "have");
        return "The " + pkg.getName() + " " + temp + "already been delivered";
    }
}
