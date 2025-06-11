package com.pluralsight.workbook8.sakilamovies.dao;

import com.pluralsight.workbook8.sakilamovies.model.Film;
import com.pluralsight.workbook8.sakilamovies.repository.FilmRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDao implements FilmRepository {
    private final Connection connection;

    public FilmDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Film> findAllFilmsByFirstAndLastName(String firstName, String lastName) {
        List<Film> films = new ArrayList<>();
        String sql =
                "SELECT * FROM film " +
                        "JOIN film_actor ON film.film_id = film_actor.film_id " +
                        "JOIN actor ON film_actor.actor_id = actor.actor_id " +
                        "WHERE actor.first_name LIKE ? AND actor.last_name LIKE ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, "%" + firstName + "%");
            ps.setString(2, "%" + lastName + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    films.add(new Film(rs.getInt("film_id"), rs.getString("title"), rs.getString("description"), rs.getInt("release_year"), rs.getInt("length")));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving movies for actor: " + firstName + " " + lastName);
        }

        return films;
    }
}
