package observer;

import java.util.ArrayList;
import java.util.Observer;

public class watchman implements Subject {
    private ArrayList<Observer> observers;
    public watchman(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observers);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observers);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
			observer.update(observers); // update the observers
		}
    }
    public issueWarning(int warning){
        if(warning == 1){
            System.out.println("WARNING:  1 trumpet was played!");
        }else if(warning == 2){
            System.out.println("WARNING:  2 trumpets were played!");
        }
        notifyObservers();
    }
}
