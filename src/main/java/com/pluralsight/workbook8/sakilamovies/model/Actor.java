package com.pluralsight.workbook8.sakilamovies.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Actor {
    private int actorId;
    private String firstName;
    private String lastName;

    public Actor(int id, String firstName, String lastName) {
        this.actorId = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
