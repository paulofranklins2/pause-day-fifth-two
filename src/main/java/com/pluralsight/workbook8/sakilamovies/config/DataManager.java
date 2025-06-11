package com.pluralsight.workbook8.sakilamovies.config;

import org.apache.commons.dbcp2.BasicDataSource;

public class DataManager {

    private static final String DB_URL = "jdbc:mariadb://localhost:3306/sakila";

    public void checkStringArgs(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Expected 2 arguments: username and password.");
        }
    }

    public BasicDataSource getDataSourceConnections(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(DB_URL);
        dataSource.setUsername(args[0]);
        dataSource.setPassword(args[1]);
        return dataSource;
    }
}