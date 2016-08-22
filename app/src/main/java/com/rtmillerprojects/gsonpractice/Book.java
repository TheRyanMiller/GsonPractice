package com.rtmillerprojects.gsonpractice;

/**
 * Created by Ryan on 8/14/2016.
 */
public class Book {

    private int publishYear;
    private String[] authors;
    private String isbn;
    private String title;

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {this.isbn = isbn; }

    public int getPublishYear() {
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
