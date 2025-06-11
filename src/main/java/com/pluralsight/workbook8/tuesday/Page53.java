package com.pluralsight.workbook8.tuesday;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;
import java.util.Scanner;

import static com.pluralsight.workbook8.monday.CustomerByCompanyName.url;

public class Page53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        argsChecker(args);
        Integer option = mainMenu(scanner);
        if (option == null) return;

        try (Connection connection = getDataSource(args).getConnection()) {
            String sql;
            switch (option) {
                case 1 -> sql = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products"; // getAllProducts -> select * from products
                case 2 -> sql = "SELECT ContactName, CompanyName, City, Country, Phone FROM customers";
                case 3 -> sql = "SELECT CategoryID, CategoryName FROM categories";
                case 0 -> {
                    System.out.println("Bye");
                    return;
                }
                default -> {
                    System.out.println("Invalid option.");
                    return;
                }
            }
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                switch (option) {
                    case 1 ->
                            System.out.println(rs.getString("ProductID") + " | " + rs.getString("ProductName") + " | " + rs.getString("UnitPrice") + " | " + rs.getString("UnitsInStock"));
                    case 2 ->
                            System.out.println(rs.getString(rs.getString("ContactName") + " | " + rs.getString("CompanyName") + " | " + rs.getString("City") + " | " + rs.getString("Country") + " | " + rs.getString("Phone")));
                    case 3 -> System.out.println(rs.getString("CategoryID") + " | " + rs.getString("CategoryName"));
                }
            }

        } catch (SQLException e) {
            System.err.println("Something went wrong. Error connecting to database or executing query: " + e.getMessage());
        }
    }

    private static BasicDataSource getDataSource(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(args[0]);
        dataSource.setPassword(args[1]);
        return dataSource;
    }

    private static Integer mainMenu(Scanner scanner) {
        System.out.println("What would you like to do?");
        System.out.println("[1]. Display all products");
        System.out.println("[2]. Display all customers");
        System.out.println("[3]. Display all categories");
        System.out.println("[0]. Exit");
        System.out.print("Select an option: ");

        int option;
        try {
            option = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return null;
        }
        return option;
    }

    private static void argsChecker(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Page53 requires username password");
            System.exit(1);
        }
    }
}
