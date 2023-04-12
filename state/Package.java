package state;

public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    public Package (String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.orderedState = new OrderedState(this, quantity);
        this.inTransitState = new InTransitState(this, quantity);
        this.deliveredState = new DeliveredState(this, quantity);
        this.state = orderedState;
    }
    public String order() {
        setState(orderedState);
        return state.getStatus() + " " + state.getETA();
    }
    public String mail() {
        setState(inTransitState);
        return state.getStatus() + " " + state.getETA();
    }
    public String received() {
        setState(deliveredState);
        return state.getStatus();
    }
    public String delay() {
        state.delay();
        return state.getETA();
    }
    public void setState(State state) {
        this.state = state;
    }
    public String getName() {
        return name;
    }
}
