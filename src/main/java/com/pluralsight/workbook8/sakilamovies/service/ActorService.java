package com.pluralsight.workbook8.sakilamovies.service;

import com.pluralsight.workbook8.sakilamovies.repository.ActorRepository;

public class ActorService {
    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public void printActorsByLastName(String lastName) {
        actorRepository.findAllByLastName(lastName).forEach(actor ->
                System.out.printf("First Name: %s | Last Name: %s%n", actor.getFirstName(), actor.getLastName()));
    }
}

