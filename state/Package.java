package state;
/**
 * @author - Harshil shah
 */
public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;
    /**
     * constructor sets name, and quantity and 
     * all the state variables
     * @param name
     * @param quantity
     */
    public Package (String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.orderedState = new OrderedState(this, quantity);
        this.inTransitState = new InTransitState(this, quantity);
        this.deliveredState = new DeliveredState(this, quantity);
        this.state = orderedState;
    }
    /**
     * @return - sets the state to orderedestate
     * and then gets the string from getStatus and 
     * getEta method in OrderedState class
     */
    public String order() {
        setState(orderedState);
        return state.getStatus() + "\n" + state.getETA();
    }
    /**
     * @return - sets the state to in transit state
     * and then gets the string from getstatus and 
     * get eta method in transit state class
     */
    public String mail() {
        setState(inTransitState);
        return state.getStatus() + "\n" + state.getETA();
    }
    /**
     * sets the state to delivered state
     * @return - and then gets the string from getstatus method
     *  in delivered state class
     * 
     */
    public String received() {
        setState(deliveredState);
        return state.getStatus();
    }
    /**
     * calls the delay method and 
     * getEta method
     * @return
     */
    public String delay() {
       // state.delay();
       return state.delay() + "\n" + state.getETA();
    }
    /**
     * sets the state data memeber and gives
     * it a value
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }
    /**
     * getter that returns name
     * @return
     */
    public String getName() {
        return name;
    }
}
