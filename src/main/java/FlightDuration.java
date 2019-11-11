package main.java;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FlightDuration {


    public static void main(String[] args) {

        ZoneId Syd = ZoneId.of("Australia/Sydney");
        ZoneId los = ZoneId.of("America/Los_Angeles");

        LocalDateTime dateTime = LocalDateTime.of(2019, 11, 11, 11, 15);
        LocalDateTime dateTime2 = LocalDateTime.of(2019, 11, 11, 6, 0);

        ZonedDateTime SydDateTime = ZonedDateTime.of(dateTime, Syd);
        ZonedDateTime losDateTime2 = ZonedDateTime.of(dateTime2, los);

        Duration duration = Duration.between(SydDateTime, losDateTime2);

        System.out.println(duration);


    }
}