package state;

public class DeliveredState extends State {
    private int days;

    public DeliveredState(Package pkg, int quantity) {
        super(pkg, quantity);
        this.days = 0;
    }
    public String getStatus() {
        String temp = getVerb("is", "are");
        return "The " + pkg.getName() + " " + temp + " here for you";
    }
    public String getETA() {
        String temp = getVerb("is", "are");
        return "The " + pkg.getName() + " " + temp + " here";
    }
    public String delay() {
        String temp = getVerb("has", "have");
        return "The " + pkg.getName() + " " + temp + "already been delivered";
    }
}
