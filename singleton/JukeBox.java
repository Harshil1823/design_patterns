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

        if (!hasMoreSongs()) {
            return "You need to add songs to the list";
        } else {
            String nextSong = songQueue.poll();
            return "Let's jam to " + nextSong + ".";
        }
    }

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

    public boolean hasMoreSongs() {
        return !songQueue.isEmpty();
        //return !songs.isEmpty();
    }

}
