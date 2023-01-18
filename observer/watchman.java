package observer;

import java.util.ArrayList;

public class Watchman implements Subject {
    private ArrayList<Observer> observers;
    public Watchman(){
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
