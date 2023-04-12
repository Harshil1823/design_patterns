package state;

import javax.swing.undo.StateEditable;

public class OrderedState extends State{
    private int days;

    public OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);
        this.days = 2;
    }
    public String getStatus() {
        String temp = getVerb("was", "were");
        return "The " + pkg.getName() + " " + temp + " ordered";
    }
    public String getETA() {
        return "The " + pkg.getName() + " will be shipped within " + days + " business days";
    }
    public String delay() {
        days += 2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing.";
    }
}
