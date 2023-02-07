package iterator;
import java.util.Iterator;

public class AlbumIterator {
    private Song [] songs;
    private int position = 0;

    public AlbumIterator(Song[] songs){
        this.songs = songs;
    }
    public boolean hasNext(){
        if(position >= songs.length || songs[position] == null){
            return false;
        }else{
            return true;
        }
    }
    public Song next() {
        Song song = songs[position];
		position = position + 1;
		return song;
    }
}
