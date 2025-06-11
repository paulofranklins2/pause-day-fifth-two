package com.pluralsight.workbook8.sakilamovies;

import com.pluralsight.workbook8.sakilamovies.config.DataManager;
import com.pluralsight.workbook8.sakilamovies.dao.ActorDao;
import com.pluralsight.workbook8.sakilamovies.dao.FilmDao;
import com.pluralsight.workbook8.sakilamovies.service.ActorService;
import com.pluralsight.workbook8.sakilamovies.service.FilmService;

import java.sql.Connection;
import java.sql.SQLException;

import static com.pluralsight.workbook8.sakilamovies.util.InputHelper.stringInput;

public class Main {
    public static void main(String[] args) {
        init(args);
    }

    public static void init(String[] args) {
        try {
            DataManager dataManager = new DataManager();
            dataManager.checkStringArgs(args);

            try (Connection connection = dataManager.getDataSourceConnections(args).getConnection()) {
                ActorDao actorDAO = new ActorDao(connection);
                FilmDao filmDAO = new FilmDao(connection);
                ActorService actorService = new ActorService(actorDAO);
                FilmService filmService = new FilmService(filmDAO);

                String lastName = stringInput("Enter last name: ");
                actorService.printActorsByLastName(lastName);

                String firstName = stringInput("Enter first name: ");
                lastName = stringInput("Enter last name: ");
                filmService.printMoviesByActorName(firstName, lastName);
            }

        } catch (SQLException e) {
            System.err.println("A database error occurred: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        }
    }
}
