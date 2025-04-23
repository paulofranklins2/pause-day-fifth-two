package com.pluralsight.thirdworkbook.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatesAgain {
    public static void main(String[] args) {
        System.out.println("\uD83D\uDFE2 Level 1: Getting started with LocalDate and LocalTime");
        first();
        second();
        third();
        fourth();
        fifth();
        sixth();

        System.out.println();
        System.out.println("\uD83D\uDFE1 Level 2: LocalDateTime and basic calculations");
        seventh();
        eight();
        nine();
        ten();
        eleven();
        twelve();

        System.out.println();
        System.out.println("\uD83D\uDD35 Level 3: Parsing and formatting");
        thirteen("2020-10-10");
        fourteen("10:24");
        fifteen("2025-04-01T09:30");
        sixteen("10/04/2022");
        seventeen();
        eighteen();

        System.out.println();
        System.out.println("\uD83D\uDFE3 Level 4: Comparing and calculating time differences");
        nineteen("10/10/2026");

        System.out.println();
        System.out.println("Level 5: Applications and mini challenges");
        twentyFourth("10/10/2030");
        twentyFifth("20/10/2025");

        System.out.println();
        System.out.println("FOR LATER");
        twentieth("10/10/2026");
        twentyFirst("01/02/2024", "10/10/2030");
        twentySecond("10:54", "19:02");
        twentyThird("05/03/1995");
    }

    //Print today's date
    public static void first() {
        var localDateNow = LocalDate.now();
        System.out.println(localDateNow);
    }

    //Print a specific date
    public static void second() {
        var localDate = LocalDate.of(2025, 12, 25);
        System.out.println(localDate);
    }

    //Get parts of a date
    public static void third() {
        var localDate = LocalDate.now();
        System.out.println("Year: " + localDate.getYear());
        System.out.println("Month: " + localDate.getMonth());
        System.out.println("Day: " + localDate.getDayOfMonth());
        System.out.println("Day: " + localDate.getDayOfWeek());
        System.out.println("Day: " + localDate.getDayOfMonth());
    }

    //Print the current time
    public static void fourth() {
        var localTimeNow = LocalTime.now();
        System.out.println(localTimeNow);
    }

    //Create a specific time
    public static void fifth() {
        var localTime = LocalTime.of(15, 30);
        System.out.println(localTime);
    }

    //Print parts of a time
    public static void sixth() {
        var hour = LocalTime.now().getHour();
        System.out.println(hour);
        var minute = LocalTime.now().getMinute();
        System.out.println(minute);
    }

    //Create a LocalDateTime from date and time
    public static void seventh() {
        var output = LocalDate.now() + " " + LocalTime.now();
        System.out.println(output);
    }

    //Print the current date and time
    public static void eight() {
        var localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    //Add 1 week to today’s date
    public static void nine() {
        var localDateTime = LocalDateTime.now().plusWeeks(1);
        System.out.println(localDateTime);
    }

    //Subtract 3 days from a specific date
    public static void ten() {
        var localDateTime = LocalDateTime.now().plusDays(-3);
        System.out.println(localDateTime);
    }

    //Add 2 hours and 15 minutes to a LocalTime
    public static void eleven() {
        var localTime = LocalTime.now().plusHours(2).plusMinutes(15);
        System.out.println(localTime);
    }

    //Calculate tomorrow's datetime
    public static void twelve() {
        var localTime = LocalTime.now().plusHours(24);
        System.out.println(localTime);
    }

    //Parse a date from a string (yyyy-MM-dd)
    public static void thirteen(String s) {
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("LocalDate: " + LocalDate.parse(s, formatter));
    }

    //Parse a time from a string (HH:mm)
    public static void fourteen(String s) {
        var inputFormatter = DateTimeFormatter.ofPattern("HH:mm");
        var formatter = LocalTime.parse(s, inputFormatter);
        System.out.println(formatter);
    }

    //Parse a LocalDateTime from a string
    public static void fifteen(String s) {
        var inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        var formatter = getLocalDateTime(s, inputFormatter);
        System.out.println(formatter);
    }

    //Format a date using DateTimeFormatter
    public static void sixteen(String s) {
        var inputFormatter = getLocalDateFormatter();
        var outputFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        var localDate = LocalDate.parse(s, inputFormatter);
        var formatted = localDate.format(outputFormatter);
        System.out.println(formatted);
    }

    //Format a time to show hours and minutes
    public static void seventeen() {
        var outputFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(getFormatLocalTimeNow(outputFormatter));
    }

    private static String getFormatLocalTimeNow(DateTimeFormatter outputFormatter) {
        return LocalTime.now().format(outputFormatter);
    }

    //Format a datetime to a full sentence
    public static void eighteen() {
        var outputFormatter = DateTimeFormatter.ofPattern(("MMMM d, yyyy 'at' h:mm a"));
        System.out.println(getFormatLocalDateTimeNow(outputFormatter));
    }

    private static String getFormatLocalDateTimeNow(DateTimeFormatter outputFormatter) {
        return LocalDateTime.now().format(outputFormatter);
    }

    //Check if a date is before or after today
    public static void nineteen(String s) {
        var inputFormatter = getLocalDateFormatter();
        var localDate = LocalDate.parse(s, inputFormatter);
        var localDateTime = localDate.atStartOfDay();
        var before = LocalDateTime.now().isBefore(localDateTime);
        System.out.println("isBefore: " + before);
        var after = LocalDateTime.now().isAfter(localDateTime);
        System.out.println("isAfter: " + after);
    }

    //Find the number of days between two dates
    public static void twentieth(String s) {
        DateTimeFormatter inputFormatter = getLocalDateFormatter();
        var localDate = LocalDate.parse(s, inputFormatter);
        var chronoLocalDateTime = ChronoUnit.DAYS.between(localDate, LocalDateTime.now());
        System.out.println(chronoLocalDateTime);

    }

    //Find the period (years, months, days) between two dates
    public static void twentyFirst(String s1, String s2) {
        var localDateFormatter = getLocalDateFormatter();
        var firstInput = getLocalDate(s1, localDateFormatter);
        var secondInput = getLocalDate(s2, localDateFormatter);
        var durationPeriod = Period.between(firstInput, secondInput);
        System.out.println("Years: " + durationPeriod.get(ChronoUnit.YEARS) + " Months: " + durationPeriod.getMonths() + " Days: " + durationPeriod.get(ChronoUnit.DAYS));
    }

    //Find the duration between two times
    public static void twentySecond(String s1, String s2) {
        var x = LocalTime.parse(s1);
        var y = LocalTime.parse(s2);
        var durationPeriod = Duration.between(x, y);
        var hours = durationPeriod.toHours();
        var minutes = durationPeriod.toMinutes() % 60;
        System.out.println("Hours: " + hours + " Minutes: " + minutes);
    }

    private static LocalDateTime getLocalDateTime(String s, DateTimeFormatter localDateFormatter) {
        return LocalDateTime.parse(s, localDateFormatter);
    }

    private static LocalDate getLocalDate(String s, DateTimeFormatter localDateFormatter) {
        return LocalDate.parse(s, localDateFormatter);
    }

    //Calculate your age from a birthday
    public static void twentyThird(String s) {
        var localDateFormatter = getLocalDateFormatter();
        var birthday = LocalDate.parse(s, localDateFormatter);
        var localDatePeriod = Period.between(birthday, LocalDate.now());
        System.out.println(localDatePeriod.getYears());
    }

    private static DateTimeFormatter getLocalDateFormatter() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    //Create a countdown to an event
    public static void twentyFourth(String s) {
        var localDateTimeFormatter = getLocalDateFormatter();
        var result = Period.between(LocalDate.parse(s, localDateTimeFormatter), LocalDate.now());
        var daysLeft = result.getDays() + (result.getYears() * 365) + (result.getMonths() * 30);
        System.out.println("Days: " + Math.absExact(result.getDays()) + " Months: " + Math.abs(result.getMonths()) + " Years: " + Math.abs(result.getYears()));
        System.out.println("Years: " + result.getYears());
        System.out.println("Months: " + result.getMonths());
        System.out.println("DaysLeft: " + Math.abs(daysLeft));
    }

    //Print a schedule of the next 4 weekly meetings
    public static void twentyFifth(String s) {
        var localDateFormatter = getLocalDateFormatter();
        var meeting = LocalDate.parse(s, localDateFormatter);
        for (int i = 0; i < 4; i++) {
            System.out.println("Meeting: " + meeting.plusWeeks(i));
        }
    }
}
