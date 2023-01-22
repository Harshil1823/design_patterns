package observer;
/**
 * Teacher class that registers teacher as an observer
 * and what the teacher does when given warning
 * implements (update) method form Observer interface
 * @author Harhsil Shah
 */
public class Teacher implements Observer {

    private Subject watchman;
    
/**
 * Method on how Tacher will react when given warning
 * @param warning - calculates what number of warning is given and reacts accordingly
 */
    public void update(int Warning) {
        if(Warning == 1) {
            System.out.println("Teacher: Helps get every kid home safe");
        }else if(Warning == 2){
            System.out.println("Teacher: Brings all students to the underground shelter");
        }      
    }
/**
 * Constructor that initializes watchman
 * and also registers Teacher as an observer
 * @param watchman - used to initialize and register the teacher as an observer
 */
    public Teacher(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
}
