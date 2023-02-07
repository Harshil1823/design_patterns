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
        Song songs = new Song(name, artist, length, genre);
        if (this.count >= MAX_Songs) {
			return false;
		} else {
            count += 1;  // increment count
            return true;
		}
    }
    
    public AlbumIterator createIterator() {
        return new AlbumIterator(songs);
    }

    public String getName() {
        return this.name;
    }
}

