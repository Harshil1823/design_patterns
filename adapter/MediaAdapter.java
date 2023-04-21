package adapter;

import java.security.spec.NamedParameterSpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

public class MediaAdapter implements Media {
    private LittleMedia littleMedia;
    /**
     * Basically sets the littleMedia to
     * littleMedia that's passes in as a object
     * @param littleMedia
     */
    public MediaAdapter(LittleMedia littleMedia){
        this.littleMedia = littleMedia;
    }
    /**
     * returns String of the title 
     */
    @Override
    public String getTitle() {
        return littleMedia.getTitle();
    }
    /**
     * returns the object author which it gets from 
     * Little media getAuthor method
     * it manipules strings and that's it
     */
    @Override
    public Author getAuthor() {
        String [] names = littleMedia.getAuthor().split(" ");
        return new Author(names[0], names[1]);
    }
    /**
     * returns getDescrption as a String
     */
    @Override
    public String getDescription() {
        return littleMedia.getDescription();
    }
    /**
     * Takes the necessary params
     * and it organizes them 
     */
    @Override
    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        String tempName = firstName + " " + lastName;
        littleMedia.addReview(tempName, date, (int)rating, comment);
    }
    /**
     * String manipulation done to getReviews 
     * now it holds first name, last name, date, rating, 
     * and then the comment rather than holding userName
     */
    public ArrayList<Review> getReviews() {
        ArrayList<Review> allReviews = new ArrayList<Review>();
        ArrayList<String> reviewStrings = littleMedia.getReviews();
        for(String reviewString : reviewStrings) {
            String[] parts = reviewString.split(" - ");
            double rating = Double.parseDouble(parts[0].split(" ")[0]);
            String comment = parts[1];
            String[] names = parts[2].split(" ");
            String firstName = names[0];
            String lastName = "";
            if(names.length > 1) {
                lastName = names[1];
            }
            // Parse the date from the review string
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date date = null;
            try {
                date = dateFormat.parse(parts[2]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            allReviews.add(new Review(firstName, lastName, date, rating, comment));
        }
        return allReviews;
    }
}
