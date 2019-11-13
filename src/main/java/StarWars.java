package main.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class StarWars {


    static List IgnoreList() {
        List<DayOfWeek> ignore = new ArrayList<>();
        ignore.add(DayOfWeek.MONDAY);
        ignore.add(DayOfWeek.TUESDAY);
        ignore.add(DayOfWeek.WEDNESDAY);
        ignore.add(DayOfWeek.THURSDAY);
        ignore.add(DayOfWeek.FRIDAY);
        return ignore;
    }


    public static long TotalDays(LocalDate start1, LocalDate end1, List<DayOfWeek> ignore) {
        return DayCounter(start1, end1, ignore) + 1;

    }

    public static long DayCounter(LocalDate start1, LocalDate end1, List<DayOfWeek> ignore) {
        int count = 0;
        LocalDate current = start1.plusDays(0);

        while (current.isBefore(end1)) {
            if (!ignore.contains(current.getDayOfWeek())) {
                count++;
            }
            current = current.plusDays(1);
        }

        return count;


    }

    static void getDay() {
        LocalDate localDate = LocalDate.of(1977, 5, 25);
        String dateInEnglish = localDate.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy", Locale.getDefault()));
        System.out.println("It was : " + dateInEnglish);


    }


}