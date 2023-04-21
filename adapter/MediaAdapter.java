package adapter;

import java.security.spec.NamedParameterSpec;
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

    @Override
    public ArrayList<Review> getReviews() {
        ArrayList<Review> allReviews = new ArrayList<Review>();
        ArrayList<Review> reviews = new ArrayList<Review>();
        for(String review : littleMedia.getReviews()) {
            String [] parts = review.split(" - ");
            double rating = Double.parseDouble(parts[0].split(" ")[0]);
            String comment = parts[1];
            String [] names = parts[2].split(" ");
            String firstName = names[0];
            String lastName = "";
            // addding a check statement 
            if(names.length > 1) {
                lastName = names[1];
            }
            Date date = new Date();
            allReviews.add(new Review(firstName, lastName, date, rating, comment));
        }
        for (Review review : reviews) {
            allReviews.add(review);
        }
        return allReviews;
    }
}