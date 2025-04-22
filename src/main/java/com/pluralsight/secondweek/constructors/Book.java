package com.pluralsight.secondweek.constructors;

public class Book {
    private String title;
    private String author;
    private int pageCount;

    public void describe() {
        System.out.println("this book is : " + title + " by author: " + author + " pageCount: " + pageCount);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.pageCount = 0;
    }
}
