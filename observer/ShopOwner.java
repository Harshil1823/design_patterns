package observer;

public class ShopOwner implements Observer {

    private Subject watchman;
   
    public void update(int warning) {
        if(warning == 1) {
            System.out.println("Shop Owner: Close down shop and head home");
        }else if(warning ==2 ){
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
        }     
    }
    public ShopOwner(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    
}
