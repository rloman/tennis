package nl.duo.tennis.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] args) {
        // gebruik geen java.util.Date meer

        // maar wel
        // LocalDate en LocalDateTime


        LocalDate gebdatRay = LocalDate.of(1968, 8, 9);
        System.out.println(gebdatRay.getYear());
        System.out.println(gebdatRay.getDayOfYear());

        LocalDate nu = LocalDate.now();

        System.out.println(nu.plusDays(8));

        System.out.println(nu.getDayOfWeek());

        long years = ChronoUnit.YEARS.between(gebdatRay, nu);

        System.out.println("Raymie is: "+years);

        Period period = Period.between(gebdatRay, nu);

        System.out.println(period);

        // LocalDateTime

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
