package com.pluralsight.thirdworkbook.collections;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return getTitle() + " by " + getAuthor();
    }
}

public class CollectionsExercise {
    private static ArrayList<String> artistList = new ArrayList<>();
    private static ArrayList<Integer> favoriteNumber = new ArrayList<>();
    private static ArrayList<Book> favoriteBook = new ArrayList<>();

    // Returns the list of favorite numbers
    public static ArrayList<Integer> getFavoriteNumber() {
        return favoriteNumber;
    }

    // Returns the list of favorite artists
    public static ArrayList<String> getArtistList() {
        return artistList;
    }

    // Generic method that returns the same list passed as argument
    public static <T> ArrayList<T> getList(ArrayList<T> list) {
        return list;
    }

    // Adds a new item to the list
    public static <T> void addItemToList(ArrayList<T> arrayList, T item) {
        getList(arrayList).add(item);
    }

    // Prints all the items in the list using a loop
    public static <T> void printList(ArrayList<T> arrayList) {
        for (T index : arrayList) {
            System.out.println(index);
        }
    }

    // Removes a specific item (least favorite) from the list
    public static <T> void removeItemFromList(ArrayList<T> arrayList, T element) {
        getList(arrayList).remove(element);
    }

    // Sums all the integers in the list and prints the total
    public static <T> void sumNumbersInList(ArrayList<T> list) {
        int result = 0;
        // Ensure the list contains Integer elements before summing
        if (list.getFirst() instanceof Integer) {
            for (int i = 0; i < list.size() - 1; i++) {
                result += (int) list.get(i);
            }
        }
        System.out.println(result);
    }

    // Safely removes the last item from the list, if the list is not empty
    public static void removeLastItemSafely(ArrayList<Book> list) {
        if (!list.isEmpty()) {
            list.removeLast();
        }
    }


    public static void main(String[] args) {

        // Create a list of your favorite artists (or book or animals) - type String
        // Add 3 items to it
        var artist = getList(artistList);
        addItemToList(artist, "Samantha");
        addItemToList(artist, "Ryan");
        addItemToList(artist, "Wilmer");
        addItemToList(artist, "You Know Who");

        // Print all of them with a loop
        System.out.println("Artist List:");
        System.out.println("Before Removing");
        printList(getArtistList());

        // Remove your least favorite
        removeItemFromList(getArtistList(), "You Know Who");

        // Print all of them with a loop
        System.out.println();
        System.out.println("After Removing");
        printList(getArtistList());

        System.out.println();

        // Create a list of your favorite numbers - type Integer
        // Add your favorite numbers
        addItemToList(getFavoriteNumber(), 5);
        addItemToList(getFavoriteNumber(), 5);
        addItemToList(getFavoriteNumber(), 5);
        addItemToList(getFavoriteNumber(), 5);
        addItemToList(getFavoriteNumber(), 4);

        // Print all of them with a loop
        System.out.println("Favorite Number List:");
        System.out.println("Before Removing");
        printList(getFavoriteNumber());

        // Remove your least favorite
        removeItemFromList(getFavoriteNumber(), 4);

        // Print all of them with a loop
        System.out.println();
        System.out.println("After Removing");
        printList(getFavoriteNumber());

        // Sum all the numbers and print the total
        System.out.println("Sum:");
        sumNumbersInList(getFavoriteNumber());

        System.out.println();

        // Create a list of Book objects - type Book
        var book = new Book("Samantha", "Ryan");
        var book2 = new Book("Ryan", "Wilmer");
        var book3 = new Book("Wilmer", "You Know Who");
        var book4 = new Book("You Know Who", "You Know Who");

        // Add three book objects
        addItemToList(favoriteBook, book);
        addItemToList(favoriteBook, book2);
        addItemToList(favoriteBook, book3);

        // Print the title of all of them
        System.out.println("Before Removing");
        printList(favoriteBook);

        // Remove the last one
        removeLastItemSafely(favoriteBook);

        System.out.println();

        // Add a new one
        // Print title and author for each of them
        System.out.println("After Removing");
        addItemToList(favoriteBook, book4);
        printList(favoriteBook);
    }

}
