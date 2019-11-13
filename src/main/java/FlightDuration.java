package main.java;


import java.time.*;

public class FlightDuration {


    public static String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;

    }

    public static void main(String[] args) {

        ZoneId Syd = ZoneId.of("Australia/Sydney");
        ZoneId los = ZoneId.of("America/Los_Angeles");

        LocalDateTime dateTime = LocalDateTime.of(2019, 11, 11, 11, 15);
        LocalDateTime dateTime2 = LocalDateTime.of(2019, 11, 11, 6, 0);

        ZonedDateTime SydDateTime = ZonedDateTime.of(dateTime, Syd);
        ZonedDateTime losDateTime2 = ZonedDateTime.of(dateTime2, los);

        Duration duration = Duration.between(SydDateTime, losDateTime2);

        System.out.println("It was : " + formatDuration(duration));


        LocalDate start1 = LocalDate.of(1977, 05, 25);
        LocalDate end1 = LocalDate.of(1977, 05, 25).plusYears(2);
        StarWars.getDay();
        System.out.println("Total was played: " + StarWars.TotalDays(start1, end1, StarWars.IgnoreList()) + " times.");


    }

}
