package com.pluralsight.workbook8.sakilamovies.dao;

import com.pluralsight.workbook8.sakilamovies.model.Actor;
import com.pluralsight.workbook8.sakilamovies.repository.ActorRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActorDao implements ActorRepository {
    private final Connection connection;

    public ActorDao(Connection connection) {
        this.connection = connection;
    }

    public List<Actor> findAllByLastName(String lastName) {
        List<Actor> actors = new ArrayList<>();
        String sql = "SELECT * FROM actor WHERE last_name LIKE ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, "%" + lastName + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    actors.add(new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name")));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving actor's by last name: " + lastName);
        }
        return actors;
    }


}
