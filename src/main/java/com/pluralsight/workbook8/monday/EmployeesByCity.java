package com.pluralsight.workbook8.monday;

import java.sql.*;
import java.util.Scanner;

import static com.pluralsight.workbook8.monday.CustomerByCompanyName.url;

public class EmployeesByCity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the city: ");
        String city = in.nextLine();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, args[0], args[1]);
            String sql = "select FirstName, LastName from employees where city = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, city);
            resultSet = preparedStatement.executeQuery();
            System.out.println("employees matching city: " + city);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("FirstName") + " " + resultSet.getString("LastName"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
