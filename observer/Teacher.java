package observer;

public class Teacher implements Observer {

    private Subject watchman;
    

    public void update(int Warning) {
        if(Warning == 1) {
            System.out.println("Teacher: Helps get every kid home safe");
        }else if(Warning ==2 ){
            System.out.println("Teacher: Brings all students to the underground shelter");
        }      
    }
    public Teacher(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
}
