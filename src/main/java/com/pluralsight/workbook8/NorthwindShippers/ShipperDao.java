package com.pluralsight.workbook8.NorthwindShippers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShipperDao implements ShipperRepository {
    private final Connection connection;

    ShipperDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Shipper> getAllShippers() {
        List<Shipper> shippers = new ArrayList<>();
        String sql = "SELECT * FROM shippers";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    shippers.add(
                            new Shipper(
                                    resultSet.getInt("ShipperID"),
                                    resultSet.getString("CompanyName"),
                                    resultSet.getString("Phone")));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving shippers");
        }
        return shippers;
    }

    @Override
    public void addShipper(Shipper shipper) {
        String sql = "INSERT INTO shippers (CompanyName, Phone) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, shipper.getCompanyName());
            preparedStatement.setString(2, shipper.getPhone());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error retrieving shippers");
        }
    }

    @Override
    public void removeShipper(int shipperId) {
        if (shipperId > 3) {
            String sql = "DELETE FROM shippers WHERE ShipperID = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, shipperId);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.err.println("Error retrieving shippers");
            }
        }
    }

    @Override
    public void updateShipper(int shipperId, String phone) {
        if (shipperId > 3) {
            String sql = "UPDATE shippers SET Phone = ? WHERE ShipperID = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, phone);
                preparedStatement.setInt(2, shipperId);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.err.println("Error retrieving shippers");
            }
        }
    }
}
