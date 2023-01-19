package observer;

import java.util.ArrayList;

public class Watchman implements Subject {
    private int warning = 0;
    private ArrayList<Observer> observers;
    public Watchman(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void issueWarning(int warning){
        this.warning = warning;
        if(warning == 1){
            System.out.println("WARNING:  1 trumpet was played!");
        }else if(warning == 2){
            System.out.println("WARNING:  2 trumpets were played!");
        }
        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
			observer.update(warning);
		}
    }
}
