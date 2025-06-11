package com.pluralsight.workbook8.sakilamovies.repository;

import com.pluralsight.workbook8.sakilamovies.model.Film;

import java.util.List;

public interface FilmRepository {
    List<Film> findAllFilmsByFirstAndLastName(String firstName, String lastName);
}
