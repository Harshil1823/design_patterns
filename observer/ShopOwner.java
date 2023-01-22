package observer;
/**
 * ShopOwner class that registers shopOwner as an observer
 * and what the shopOwner does when given warning
 * implements (update) method form Observer interface
 * @author Harhsil Shah
 */
public class ShopOwner implements Observer {

    private Subject watchman;
/**
 * Method on how shopOwner will react when given warning
 * @param warning - calculates what warning is given and reacts accordingly
 */
    public void update(int warning) {
        if(warning == 1) {
            System.out.println("Shop Owner: Close down shop and head home");
        }else if(warning ==2 ){
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
        }     
    }
/**
 * Construcotr that initializes watchman
 * and also registers showOwner as an observer
 * @param watchman - used to initialize and register the shop owner as an observer
 */
    public ShopOwner(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    
}
