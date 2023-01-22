package observer;

import java.util.ArrayList;
/**
 * registers observers, removes them, issues warning, and notifies observers 
 * @author Harshil Shah
 */
public class Watchman implements Subject {
    private int warning = 0;
    private ArrayList<Observer> observers;
/**
 * constructor
 * creating new ArrayList of type observer interface 
 */
    public Watchman(){
        observers = new ArrayList<Observer>();
    }
/**
 * Method is used to registerObservers
 * @param - takes observer as an input and adds that to the Arraylist of Observers
 */
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }
/**
 * RemovesObserver from the ArrayList
 * @param - finds the observer we are looking for and removes the observer
 */
    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
/**
 * Gives warning out and notifies the observer method
 * @param warning - checks what warning it is and plays a trumpet according to it
 */
    public void issueWarning(int warning){
        this.warning = warning;
        if(warning == 1){
            System.out.println("WARNING:  1 trumpet was played!");
        }else if(warning == 2){
            System.out.println("WARNING:  2 trumpets were played!");
        }
        notifyObservers();
    }
/**
 * Notifies every observer who is registered
 * and calls update method for that observer
 */
    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
			observer.update(warning);
		}
    }
}
