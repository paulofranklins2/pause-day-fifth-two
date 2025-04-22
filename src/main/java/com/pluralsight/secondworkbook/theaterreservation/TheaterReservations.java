package com.pluralsight.secondworkbook.theaterreservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    String fullName;
    LocalDate date;
    int numberOfTickets;

    public void makeTheaterReservation(String fullName, String date, int numberOfTickets) {
        this.fullName = fullName;
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.date = LocalDate.parse(date, formatter);
        this.numberOfTickets = numberOfTickets;
    }

    public String printTheaterReservations() {
        StringBuilder stringBuilder = new StringBuilder();
        if (numberOfTickets > 1) {
            stringBuilder.append(numberOfTickets).append(" tickets reserved for ").append(date).append(" under ").append(fullName);
        } else {
            stringBuilder.append(numberOfTickets).append(" ticket reserved for ").append(date).append(" under ").append(fullName);

        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        TheaterReservations tr = new TheaterReservations();
        tr.makeTheaterReservation("Paulo Cunha", "15/04/2024", 1);
        String s = tr.printTheaterReservations();
        System.out.println(s);
    }
}