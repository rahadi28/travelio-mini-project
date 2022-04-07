package com.travelio.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GBVolumeInfoWrapper {
    private String title;
    private Map<String, String> imageLinks = new HashMap<>();
    private String[] authors;
    private String averageRating;
    private String ratingsCount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, String> getImageLinks() {
        return imageLinks;
    }

    public void setImageLinks(Map<String, String> imageLinks) {
        this.imageLinks = imageLinks;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    public String getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(String ratingsCount) {
        this.ratingsCount = ratingsCount;
    }
}