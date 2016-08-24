package com.rtmillerprojects.gsonpractice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan on 8/21/2016.
 */
public class Books {
    @Expose
    public int total;
    @Expose
    @SerializedName("books")
    public List<Book> bookList = new ArrayList<>();
    @Expose
    public String linkTemplate;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Book> getbookList() {
        return bookList;
    }

    public void setbookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Book getBook(int idx){
        return this.bookList.get(idx);
    }

    public String getLinkTemplate() {
        return linkTemplate;
    }

    public void setLinkTemplate(String linkTemplate) {
        this.linkTemplate = linkTemplate;
    }

}
