package iterator;

public class Album {
    private Song [] songs;
    static final int MAX_Songs = 20;
    private int count = 0;
    private String name;

    public Album (String name) {
        songs = new Song[MAX_Songs];
        this.name = name;
    } 

    public boolean addSong (String name, String artist, double length, Genre genre) {
        // Song songs = new Song(name, artist, length, genre);
        Song newSong = new Song(name, artist, length, genre);
        for (int i = 0; i < songs.length; i++) {
          if (songs[i] == null) {
            songs[i] = newSong;
            return true;
          }
        }
        return false;
    }
    
    public AlbumIterator createIterator() {
        return new AlbumIterator(songs);
    }

    public String getName() {
        return this.name;
    }
}

