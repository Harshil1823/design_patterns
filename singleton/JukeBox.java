package singleton;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class JukeBox {
    private static JukeBox jukeBox;
    private ArrayList<Song> songs;
    private Queue<String>songQueue;
    
    private JukeBox() {
        DataLoader dataLoader = new DataLoader();
        songs = dataLoader.getSongs();
        songQueue = new ArrayDeque<String>();
    }

    public static JukeBox getInstance() {
        if(jukeBox == null) {
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    public String playNextSong() {
        if (songs.isEmpty()) {
            return "You need to add songs to the list";
        } else {
            Song nextSong = songs.get(0);
            songs.remove(0);
            return "Let's jam to " + nextSong.getTitle();
        }
    }

    public String requestSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                songQueue.offer(title);
                int position = i + 1; // Add 1 to the index to get the correct position
                return title + " is now number " + position + " on the list";
            }
        }
        return "Sorry we do not have the song " + title;
    }

    public boolean hasMoreSongs() {
        return !songs.isEmpty();
    }

    
}
