package decorator;

public abstract class IceCream {
    protected String description;

    public String toString(){
        return description;
    }

    public abstract double getCost();
}
