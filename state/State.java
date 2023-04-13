package state;

public abstract class State {

    protected Package pkg;
    protected int quantity;
    /**
     * constructor to init
     * values
     * @param pkg
     * @param quantity
     */
    public State(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }
    public abstract String getStatus();
    public abstract String getETA();
    public abstract String delay();
    /**
     * takes in two params and checks if 
     * quanitty is greater than 1 or not 
     * if not then returns singular
     * if it is greater than 1 then plural
     * @param singular
     * @param plural
     * @return
     */
    protected String getVerb(String singular, String plural) {
        return quantity == 1 ? singular : plural;
    }
}
