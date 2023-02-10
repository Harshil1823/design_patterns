package iterator;
/**
 * Album class that adds songs
 * and returns the name of songs 
 * that are added
 * @author Harshil Shah
 */
public class Album {
    private Song [] songs;
    // static final int MAX_Songs = 20;
    private int count = 0;
    private String name;
/**
 * Creates a array of Songs and initiallizes it
 * @param name - Passes in the name of the Album
 * And sets the name of the album too the private 
 * variable name in this Album class
 */
    public Album (String name) {
        int MAX_Songs = 20;
        songs = new Song[MAX_Songs];
        this.name = name;
    } 
/**
 * new object of named newSong is created and 
 * allocates memory for a new instance of the class song
 * calls the constructor in Song that take the param belows and initializes it.
 * Also, every new song(new object) is stored in songs array in this class
 * @param name - gets the name of the song and adds it to the array
 * @param artist - gets the name of the artist and adds it to the array
 * @param length - gets the length of the song and adds it to the array
 * @param genre - gets the Genre of array and adds it to the array
 * @return true if the song is added in the array or returns false
 */
    public boolean addSong (String name, String artist, double length, Genre genre) {
        Song newSong = new Song(name, artist, length, genre);
        for (int i = 0; i < songs.length; i++) {
          if (songs[i] == null) {
            songs[i] = newSong;
            return true;
          }
        }
        return false;
    }
    /**
     *  method creates and returns a new instance of the AlbumIterator class, 
     * which takes an array of Song objects as an argument.
     * @return 
     */
    public AlbumIterator createIterator() {
        return new AlbumIterator(songs);
    }
    /**
     * 
     * @return the name of the album
     */
    public String getName() {
        return this.name;
    }
}

