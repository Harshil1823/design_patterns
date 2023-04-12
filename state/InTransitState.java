package state;

public class InTransitState extends State {
    private int days;

    public InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
        this.days = 5;
    }
    public String getStatus() {
        String temp = getVerb("is", "are");
        return "The " + pkg.getName() + " " + temp + " out for delivery";
    }
    public String getETA() {
        return "The " + pkg.getName() + " should arrive within " + days + " days";
    }
    public String delay() {
        days += 3;
        String temp = getVerb("has", "have");
        return "The " + pkg.getName() + " " + temp + " experienced a dealy in shipping";
    }
}
