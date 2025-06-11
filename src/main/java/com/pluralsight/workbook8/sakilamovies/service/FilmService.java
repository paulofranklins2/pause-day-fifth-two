package com.pluralsight.workbook8.sakilamovies.service;

import com.pluralsight.workbook8.sakilamovies.repository.FilmRepository;

import java.sql.SQLException;

public class FilmService {
    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public void printMoviesByActorName(String firstName, String lastName) throws SQLException {
        filmRepository.findAllFilmsByFirstAndLastName(firstName, lastName).forEach(film ->
                System.out.printf("ID: %d | Title: %s | Year: %d | Length: %d | Description: %s%n",
                        film.getFilmId(), film.getTitle(), film.getYear(), film.getLength(), film.getDescription()));
    }
}
