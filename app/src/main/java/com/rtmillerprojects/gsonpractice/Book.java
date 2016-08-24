package com.rtmillerprojects.gsonpractice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ryan on 8/14/2016.
 */
public class Book {

    @Expose
    @SerializedName("publish_year")
    public String publishYear;
    @Expose
    public String[] authors;
    @Expose
    @SerializedName("isbn")
    public String isbn;
    @Expose
    public String title;


    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {this.isbn = isbn; }

    public String getPublishYear() {
        return publishYear;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getIsbn() {return isbn;}

    public String getTitle() {
        return title;
    }
}
