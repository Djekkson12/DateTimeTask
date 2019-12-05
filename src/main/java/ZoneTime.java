package main.java;

import java.time.*;

public class ZoneTime {


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


    ZoneId Syd = ZoneId.of("Australia/Sydney");
    ZoneId los = ZoneId.of("America/Los_Angeles");

    LocalDateTime dateTime = LocalDateTime.of(2019, 11, 11, 11, 15);
    LocalDateTime dateTime2 = LocalDateTime.of(2019, 11, 11, 6, 0);

    ZonedDateTime SydDateTime = ZonedDateTime.of(dateTime, Syd);
    ZonedDateTime losDateTime2 = ZonedDateTime.of(dateTime2, los);

    Duration duration = Duration.between(SydDateTime, losDateTime2);


    LocalDate start1 = LocalDate.of(1977, 05, 25);
    LocalDate end1 = LocalDate.of(1977, 05, 25).plusYears(2);


}
