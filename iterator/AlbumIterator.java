package iterator;
import java.util.Iterator;
/**
 * @author - Class used to iterate over an array of songs
 */
public class AlbumIterator {
    private Song [] songs;
    private int position = 0;
/**
 * 
 * @param songs - passes in array of songs and stores in local array called songs for this class
 * 
 */
    public AlbumIterator(Song[] songs){
        this.songs = songs;
    }
    /**
     * checks if array next index isn't null
     * and then 
     * @return true if it has next position in teh array 
     * returns flase if it doesn't
     */
    public boolean hasNext(){
        if(position >= songs.length || songs[position] == null){
            return false;
        }else{
            return true;
        }
    }
    /**
     * chekcs if the array has next position 
     * and if it does then it stores the data in here 
     * if not then it moves to the next index to store the data
     * in there
     * @return the array of songs with objects inside
     */
    public Song next() {
        if(!hasNext()) {
            return null;
        }
        Song song = songs[position];
		position = position + 1;
		return song;
    }
}
