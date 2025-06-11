package com.pluralsight.workbook8.monday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import static com.pluralsight.workbook8.monday.CustomerByCompanyName.url;

public class OrderByCustomerID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (Connection connection = DriverManager.getConnection(url, args[0], args[1])) {
            System.out.println("Enter customer ID");
            String customerID = sc.nextLine();

            String sql = "select OrderID, OrderDate from orders where CustomerID=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customerID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Order ID: " + resultSet.getInt("OrderID") + " Order Date: " + resultSet.getString("OrderDate"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
