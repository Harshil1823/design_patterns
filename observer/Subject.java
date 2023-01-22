package observer;
/**
 * Interface holding valuable methods such as 
 * ReigsterObserver, removeObserver, and notifyingObserver
 * @author Harshil Shah
 */
public interface Subject {
    public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
