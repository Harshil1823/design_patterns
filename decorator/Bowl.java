package decorator;

public class Bowl extends IceCream {

    public Bowl(){
        this.description = "Bowl";
    }

    public double getCost() {
        return 0; //cost is $0
    }

}
