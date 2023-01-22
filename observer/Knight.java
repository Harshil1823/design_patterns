package observer;
/**
 * Knight class that registers knight as an observer
 * and what the knight does when given warning
 * implements (update) method form Observer interface
 * @author Harhsil Shah
 */
 
public class Knight implements Observer{
    private Subject watchman;
/**
 * Method on how the Knight will react when given warning
 * @param warning - calculates what number of warning is given and reacts accordingly
 */
    public void update(int Warning) {
        if(Warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        }else if(Warning ==2 ){
            System.out.println("Knight: Prepares for battle");
        }         
    }
/**
 * Constructor that initializes watchman
 * and also registers knight as an observer
 * @param watchman - used to initialize and register the knight as an observer
 */
    public Knight(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

}
