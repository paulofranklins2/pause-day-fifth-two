package com.pluralsight.workbook8.sakilamovies.config;

import org.apache.commons.dbcp2.BasicDataSource;

public class DataManager {

    public void checkStringArgs(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Expected 2 arguments: username and password.");
        }
    }

    public BasicDataSource getDataSourceConnections(String[] args) {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mariadb://localhost:3306/sakila");
        basicDataSource.setUsername(args[0]);
        basicDataSource.setPassword(args[1]);
        return basicDataSource;
    }
}
