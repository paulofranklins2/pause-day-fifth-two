package com.pluralsight.secondweek.loopingarrays;

import com.pluralsight.secondweek.constructors.Book;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("1. Print numbers with a for loop");
        var intArray = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("2. Count backwards with a while loop");
        var counter = intArray.length;
        while (counter > 0) {
            System.out.println(intArray[--counter]);
        }

        System.out.println();
        System.out.println();

        System.out.println("3. Greet each person");
        var person = new String[]{"Alice", "Bob", "Charlie"};
        for (int i = 0; i < person.length; i++) {
            System.out.println("Hello " + person[i]);
        }

        System.out.println();
        System.out.println();

        System.out.println("4. Calculate the total");
        var calculator = new int[]{3, 5, 7, 2, 8};
        var result = 0;
        for (int i = 0; i < calculator.length; i++) {
            result += calculator[i];
            System.out.println("index: " + i + "result: " + result);
        }
        System.out.println("5. Calculate the sum: " + result);

        System.out.println();
        System.out.println();

        System.out.println("5. Print only even numbers");

        var onlyEvenNumbers = new int[]{4, 7, 10, 15, 18};
        for (int i = 0; i < onlyEvenNumbers.length; i++) {
            if (onlyEvenNumbers[i] % 2 == 0) {
                System.out.println(onlyEvenNumbers[i]);
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("6. Stop at a certain value (while loop)");
        var printUntil = new int[]{1, 3, 5, 7, 9};
        var index = 0;
        while (true) {
            {
                if (printUntil[index] == 7) {
                    break;
                } else {
                    System.out.println(printUntil[index]);
                    index++;
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("7. Ask until valid input (do-while)");
        Scanner scanner = new Scanner(System.in);
        String pass = "";
        do {
            System.out.print("Please enter your password: ");
            pass = scanner.nextLine();
        } while (!pass.equalsIgnoreCase("secret123"));

        System.out.println();
        System.out.println();
        System.out.println("8. Count how many times \"Java\" appears");
        var count = 0;
        var stringArr = new String[]{"Java", "Python", "Java", "C#", "Java"};
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].equals("Java")) {
                count++;
            }
        }
        System.out.println("Java count: " + count);

        System.out.println();
        System.out.println();
        System.out.println("9. Find the largest number");

        var largest = new int[]{12, 5, 90, 34, 7};
        var placeHolder = 0;
        for (int i = 0; i < largest.length; i++) {
            if (largest[i] > placeHolder) {
                placeHolder = largest[i];
            }
        }
        System.out.println("Largest number: " + placeHolder);

        System.out.println();
        System.out.println();
        System.out.println("10. Compare two arrays");
        var aArrays = new int[]{1, 2, 3, 4, 5};
        var bArrays = new int[]{1, 2, 3, 3, 4};
        for (int i = 0; i < aArrays.length; i++) {
            if (aArrays[i] > bArrays[i]) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("11. Challenging: Copy one array to another");
        var aArray = new int[]{1, 2, 3, 4, 5};
        var newArray = new int[aArray.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = aArray[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("index: " + i + "value: " + newArray[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("12. Reverse an array");
        var reverseArray = new int[]{1, 2, 3, 4, 5};
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.println(reverseArray[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("13. Create and loop through an array of Book objects");
        var createArray = new Book[3];

        createArray[0] = new Book("1984", "George Orwell", 328);
        createArray[1] = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        createArray[2] = new Book("The Hobbit", "J.R.R. Tolkien", 310);

        for (int i = 0; i < createArray.length; i++) {
            System.out.println(createArray[i].getTitle());
        }
        System.out.println();
        System.out.println();
        System.out.println("14. Count books by a certain author");
        var counter2 = 0;
        for (int i = 0; i < createArray.length; i++) {
            if (createArray[i].getAuthor().equalsIgnoreCase("Alice")) {
                counter2++;
            }
        }
        System.out.println("Alice Author Counter: " + counter2);

        System.out.println();
        System.out.println();
        System.out.println("15. Print books with more than X pages");
        for (int i = 0; i < createArray.length; i++) {
            if (createArray[i].getPageCount() > 300) {
                System.out.println(createArray[i].getTitle());
            }
        }
    }
}
