package com.pluralsight.workbook8.NorthwindShippers;

import java.sql.Connection;

public class AppInitializer {

    public void run(String[] args) {
        DataManager dataManager = new DataManager();
        dataManager.checkStringArgs(args);

        try (Connection connection = dataManager.getDataSourceConnections(args).getConnection()) {

            ShipperRepository shipperRepository = new ShipperDao(connection);
            ShipperService shipperService = new ShipperService(shipperRepository);
            ScreenUtil screen = new ScreenUtil(shipperService);

            screen.init();
        } catch (Exception e) {
            System.err.println("Failed to connect to database: " + e.getMessage());
        }
    }
}