package iterator;
/**
 * Songs class that gives the value to each song
 * also contains toString method which returns 
 * the details about song
 * @author Harshil Shah
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;
    /**
     * Each param sets it's correlated variable to its value
     * @param name
     * @param artist
     * @param length
     * @param genre
     */
    public Song (String name, String artist, double length, Genre genre){
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }
    /**
     * @return - toString method that returns the information about each song
     */
    public String toString(){
        String printToUser = "";
        printToUser = this.name + " by " + this.artist + " category: " + this.genre + 
                            " length: " + length + " min";
        return printToUser;
    }
}