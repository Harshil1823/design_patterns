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
     * getter
     * @return artist
     */
    public String getArtist(){
        return this.artist;
    }
    /**
     * simpel toString method
     */
    public String toString(){
        return "Let's jam to " + title + " by " + artist ;
    }
}
