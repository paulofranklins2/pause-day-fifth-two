package com.pluralsight.workbook8.monday;

import java.sql.*;
import java.util.Scanner;

public class CustomerByCompanyName {
    public static String url = "jdbc:mariadb://localhost:3306/northwind";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String companyName = sc.nextLine();
        System.out.println("Matching customers:");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, args[0], args[1]);
            String sql = "select CustomerID, ContactName from customers where CompanyName like ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + companyName + "%");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String customerID = resultSet.getString("CustomerID");
                String contactName = resultSet.getString("ContactName");
                System.out.println("Customer ID: " + customerID + " Contact Name: " + contactName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
