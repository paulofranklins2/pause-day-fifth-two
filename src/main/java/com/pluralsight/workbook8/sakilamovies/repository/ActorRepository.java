package com.pluralsight.workbook8.sakilamovies.repository;

import com.pluralsight.workbook8.sakilamovies.model.Actor;

import java.util.List;

public interface ActorRepository {
    List<Actor> findAllByLastName(String lastName);
}
