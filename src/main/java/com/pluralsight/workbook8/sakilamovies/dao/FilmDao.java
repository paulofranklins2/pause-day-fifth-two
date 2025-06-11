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
        String sql = """
                    SELECT f.film_id, f.title, f.description, f.release_year, f.length
                    FROM film f
                    JOIN film_actor fa ON f.film_id = fa.film_id
                    JOIN actor a ON fa.actor_id = a.actor_id
                    WHERE a.first_name LIKE ? AND a.last_name LIKE ?
                """;

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, "%" + firstName + "%");
            ps.setString(2, "%" + lastName + "%");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    films.add(new Film(
                            rs.getInt("film_id"),
                            rs.getString("title"),
                            rs.getString("description"),
                            rs.getInt("release_year"),
                            rs.getInt("length")
                    ));
                }
            }
        } catch (SQLException e) {
            System.err.printf("Error retrieving movies for actor: %s %s%n", firstName, lastName);
        }

        return films;
    }
}
