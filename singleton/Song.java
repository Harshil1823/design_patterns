package singleton;
/**
 * class that contains tile and artist name
 * @author Harshil Shah
 */
public class Song {
    private String title;
    private String artist;
    /**
     * 
     * @param title - initializes title var
     * @param artist - initializes artist var
     */
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    /**
     * getter
     * @return title 
     */
    public String getTitle(){
        return this.title;
    }
    /**
     * simple toString method
     * that returns what songs we are jamming to 
     * and what artist it is from
     */
    public String toString(){
        return "Let's jam to " + title + " by " + artist ;
    }
}
