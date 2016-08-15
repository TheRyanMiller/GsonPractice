package com.rtmillerprojects.gsonpractice;

/**
 * Created by Ryan on 8/14/2016.
 */
public class Book {

    private int publishYear;
    private String[] authors;
    private String isbn10;
    private String isbn13;
    private String title;

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public String getTitle() {
        return title;
    }
}
