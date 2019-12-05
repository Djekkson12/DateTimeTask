package main.java;


import java.time.*;

public class FlightDuration {

    public static void main(String[] args) {

        LocalDate start1 = LocalDate.of(1977, 05, 25);
        LocalDate end1 = LocalDate.of(1977, 05, 25).plusYears(2);
        StarWars.getDay();
        ZoneTime zoneTime = new ZoneTime();
        System.out.println("Total was played: " + StarWars.TotalDays(start1, end1, StarWars.IgnoreList()) + " times.");
        System.out.println("It was : "+  ZoneTime.formatDuration(zoneTime.duration));

    }

}
