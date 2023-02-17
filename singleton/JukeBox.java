package singleton;
/**
 * JukeBox class that playsNextSong
 * Requests songs to be added
 * @author Harshil Shah
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class JukeBox {
    private static JukeBox jukeBox;
    private ArrayList<Song> songs;
    private Queue<String>songQueue;
    
    /**
     * private constructor
     * using to load data in Songs arrayList
     * also using to initialize the queue
     */
    private JukeBox() {
        DataLoader dataLoader = new DataLoader();
        songs = dataLoader.getSongs();
        songQueue = new ArrayDeque<String>();
    }
    /**
     * can only create one instance of this class
     * because it is expensive. So, trying to limit it.
     * @return the Instance of jukebox that is created
     */
    public static JukeBox getInstance() {
        if(jukeBox == null) {
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * Plays the nextSong in queue, if there are no song is queue
     * it tells the user to add songs to the list
     * @returns a message which contains 
     * let's jam to song name + artist
     */
    public String playNextSong() {

        if (!hasMoreSongs()) {
            return "You need to add songs to the list";
        } else {
            String nextSongTitle = songQueue.poll();
            for (Song song : songs) {
                if (song.getTitle().equals(nextSongTitle)) {
                    String message = "Let's jam to " + song.getTitle() + " by " + song.getArtist();
                    return message;
                }
            }
        }
        return null;
    }
    /**
     * checks to see if we have the song in the database and adds it to 
     * queue
     * @param title - title of the song that user wants to add
     * @return - where the song that user added is in the queue if it's valid
     * if it isn't a valid song then it prints not found
     */
    public String requestSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                songQueue.add(title);
                int position = songQueue.size();
                return title + " is now number " + position + " on the list";
            }
        }
        return "Sorry, we do not have the song " + title;
    }
    /**
     * @return true or false if the 
     * queue is empty or not
     */
    public boolean hasMoreSongs() {
        return !songQueue.isEmpty();
        //return !songs.isEmpty();
    }

}
