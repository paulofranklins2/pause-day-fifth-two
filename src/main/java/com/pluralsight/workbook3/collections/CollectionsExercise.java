package com.pluralsight.workbook3.collections;

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
        var number = getList(favoriteNumber);
        addItemToList(artist, "Samantha");
        addItemToList(artist, "Ryan");
        addItemToList(artist, "Wilmer");
        addItemToList(artist, "You Know Who");

        // Print all of them with a loop
        System.out.println("Artist List:");
        System.out.println("Before Removing");
        printList(getList(artistList));

        // Remove your least favorite
        removeItemFromList(getList(artist), "You Know Who");

        // Print all of them with a loop
        System.out.println();
        System.out.println("After Removing");
        printList(getList(artistList));

        System.out.println();

        // Create a list of your favorite numbers - type Integer
        // Add your favorite numbers
        addItemToList(getList(number), 5);
        addItemToList(number,5);
        addItemToList(number, 5);
        addItemToList(number, 5);
        addItemToList(number, 4);

        // Print all of them with a loop
        System.out.println("Favorite Number List:");
        System.out.println("Before Removing");
        printList(getList(number));

        // Remove your least favorite
        removeItemFromList(number, 4);

        // Print all of them with a loop
        System.out.println();
        System.out.println("After Removing");
        printList(getList(number));

        // Sum all the numbers and print the total
        System.out.println("Sum:");
        sumNumbersInList(number);

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
