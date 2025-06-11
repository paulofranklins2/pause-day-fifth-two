package com.pluralsight.workbook8;

import java.sql.*;

public class JDBCExercise {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Required 2 parameters");
            System.exit(1);
        }
        String username = args[0];
        String password = args[1];

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/northwind", username, password);
            String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";

            preparedStatement = connection.prepareStatement(query);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("ProductID") + " " + resultSet.getString("ProductName") + " " + resultSet.getString("UnitPrice") + " " + resultSet.getString("UnitsInStock"));
            }
        } catch (
                SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}