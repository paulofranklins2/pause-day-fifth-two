package com.pluralsight.thirdworkbook.filewriter;

import java.io.*;
import java.util.Scanner;

public class FileWriterExercise {
    static private final String FILE_PATH = "C:\\Users\\paulofranklins\\Desktop\\pluralsight\\workbook-2\\pause-day-fifth-two\\src\\main\\java\\com\\pluralsight\\thirdworkbook\\";
    static private final String FILE_NAME = "output.txt";
    static Scanner scanner = new Scanner(System.in);

    private static FileWriter getFileWriter(boolean append) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(FILE_PATH + FILE_NAME, append);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileWriter;
    }

    //1. Write a single line to a file
    public static void firstExercise(String message, boolean append) throws IOException {
        FileWriter fileWriter;

        fileWriter = getFileWriter(append);
        fileWriter.write(message);
        fileWriter.close();
    }


    //2. Read that line back
    //4. Read file line-by-line and print
    public static void secondExercise() throws IOException {
        System.out.println(returningString());
    }

    public static String returningString() throws IOException {
        var sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH + FILE_NAME));
        while (bufferedReader.ready()) {
            sb.append(bufferedReader.readLine()).append("\n");
        }
        bufferedReader.close();
        return sb.toString();
    }

    //3. Write multiple lines from an array
    public static void thirdExercise(boolean append) throws IOException {
        var sb = new StringBuilder();
        var stringArr = new String[]{"Once upon a time", "in a quiet village", "lived a curious cat", "who dreamed of adventure", "One day, it found a map", "leading to a hidden treasure", "With courage in its heart", "it set off into the wild", "facing storms and strange creatures", "until it reached a golden cave", "Inside, it found not gold", "but a mirror reflecting its brave soul", "And so, the cat returned home", "a hero in the eyes of all"};

        for (String s : stringArr) {
            sb.append(s).append("\n");
        }
        firstExercise(sb.toString(), append);
    }

    //5. Ask the user for lines and save to a file
    public static void fifthExercise(Scanner scanner, boolean append) throws IOException {
        var sb = new StringBuilder();
        System.out.print("First Line: ");
        sb.append(scanner.nextLine()).append("\n");
        System.out.print("Second Line: ");
        sb.append(scanner.nextLine()).append("\n");
        System.out.print("Third Line: ");
        sb.append(scanner.nextLine()).append("\n");

        firstExercise(sb.toString(), append);
    }

    //6. Count how many times a word appears
    public static void sixthExercise(String message) throws IOException {
        var counter = 0;
        String s = returningString();
        var split = s.split(" ");
        for (int i = 0; i < split.length - 1; i++) {
            if (split[i].equalsIgnoreCase(message)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    //7. Save an array of Book objects to file
    public static void seventhExercise(Book book, boolean append) throws IOException {
        firstExercise(book.getTitle() + ";" + book.getAuthor() + "\n", append);
    }

    public static void main(String[] args) throws IOException {
        Book[] books = {
                new Book("Clean Code", "Robert C. Martin"),
                new Book("Effective Java", "Joshua Bloch"),
                new Book("Head First Java", "Kathy Sierra")
        };

        var append = true;
        var defaultMessage = "";
        var findWord = "of";

//        firstExercise("defaultMessage", append);
//        thirdExercise(append);
//        secondExercise();
//        fifthExercise(scanner, append);
//        sixthExercise(findWord);

//        for (Book book : books) {
//            seventhExercise(book, append);
//        }

    }

}
