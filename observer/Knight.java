package observer;

public class Knight implements Observer{
    private Subject watchman;

    public Knight(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    @Override
    public void update(int Warning) {
        if(Warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        }else if(Warning ==2 ){
            System.out.println("Knight: Prepares for battle");
        }         
    }
    
}
