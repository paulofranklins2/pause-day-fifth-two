package com.pluralsight.workbook8.sakilamovies.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Film {
    private int filmId;
    private String description;
    private int year;
    private int length;
    private String title;

    public Film(int filmId, String title, String description, int year, int length) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.year = year;
        this.length = length;
    }
}
