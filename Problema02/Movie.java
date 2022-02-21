package Problema02;

import java.time.Year;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Movie
 */
public class Movie {
    private int id; 
    private String title;
    private TimeUnit duration;
    private boolean color;
    private String country;
    private String language;
    private String contentRating;
    private long budget;
    private Year titleYear;
    private float IMDBScore;
    private float aspectRatio;
    private String movieIMDBLink;

    public Movie(int id, String title, TimeUnit duration, boolean color, String country, String language,
            String contentRating, long budget, Year titleYear, float IMDBScore) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.color = color;
        this.country = country;
        this.language = language;
        this.contentRating = contentRating;
        this.budget = budget;
        this.titleYear = titleYear;
        this.IMDBScore = IMDBScore;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        if (budget != other.budget)
            return false;
        if (color != other.color)
            return false;
        if (duration != other.duration)
            return false;
        if (language == null) {
            if (other.language != null)
                return false;
        } else if (!language.equals(other.language))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (titleYear == null) {
            if (other.titleYear != null)
                return false;
        } else if (!titleYear.equals(other.titleYear))
            return false;
        return true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TimeUnit getDuration() {
        return duration;
    }

    public boolean getColor(){
        return color;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public Year getTitleYear() {
        return titleYear;
    }

    public void setTitleYear(Year titleYear) {
        this.titleYear = titleYear;
    }

    public float getIMDBScore() {
        return IMDBScore;
    }

    public void setIMDBScore(float iMDBScore) {
        IMDBScore = iMDBScore;
    }

    public float getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(float aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getMovieIMDBLink() {
        return movieIMDBLink;
    }

    public void setMovieIMDBLink(String movieIMDBLink) {
        this.movieIMDBLink = movieIMDBLink;
    }

    
}
