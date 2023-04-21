package adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

public class MediaAdapter implements Media {
    private LittleMedia littleMedia;

    public MediaAdapter(LittleMedia littleMedia){
        this.littleMedia = littleMedia;
    }

    @Override
    public String getTitle() {
        return littleMedia.getTitle();
    }

    @Override
    public Author getAuthor() {
        String [] names = littleMedia.getAuthor().split(" ");
        return new Author(names[0], names[1]);
    }

    @Override
    public String getDescription() {
        return littleMedia.getDescription();
    }

    @Override
    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        String tempName = firstName + " " + lastName;
        littleMedia.addReview(tempName, date, (int)rating, comment);
    }

    @Override
    public ArrayList<Review> getReviews() {
        ArrayList<Review> reviews = new ArrayList<>();
        for(String review : littleMedia.getReviews()) {
            String [] parts = review.split(" - ");
            String [] names = parts[1].split(" ");
            Author author = new Author(names[0], names[1]);
            String dateString = parts[2].substring(parts[2].lastIndexOf(" ") + 1);
            Date date = new Date();
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY");
                date = dateFormat.parse(dateString);
            } catch (Exception e) {
                e.printStackTrace();
            }
            double rating = Double.parseDouble(parts[0].substring(0, parts[0].indexOf(" ")));
            String comment = parts[0].substring(parts[0].indexOf(" ") + 1);
            Review reviewObj = new Review(author.getFirstName(), author.getLastName(), date, rating, comment);
            reviews.add(reviewObj); 
        }
        return reviews;
    }

}
