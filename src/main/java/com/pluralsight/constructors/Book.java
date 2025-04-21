package com.pluralsight.constructors;

public class Book {
    private String title;
    private String author;
    private int pageCount;

    public void describe() {
        System.out.println("this book is : " + title + " by author: " + author + " pageCount: " + pageCount);
    }

    Book(String title, String author, int pageCount) {
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
