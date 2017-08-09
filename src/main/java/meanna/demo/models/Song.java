package meanna.demo.models;

import com.sun.org.glassfish.gmbal.NameValue;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Song {


//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;

    @NotNull
    @NameValue
    @Size(min=1, max=50)
    private String name;

    @NotNull
    @Size(min=1, max=50)
    private String artist;

    @NotNull
    @Size(min=1, max=50)
    private String album;

    @NotNull
    private Integer rating;

    @NotNull
    private Integer year;



//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }



}
