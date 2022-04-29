package nl.duo.tennis.formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));

        LocalDateTime timestamp = LocalDateTime.now();
        System.out.println(timestamp.format(DateTimeFormatter.ISO_DATE_TIME));

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));


        System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_INSTANT));

        String r = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(zonedDateTime);
        System.out.println(r);


        // Remember for ISO8601 used to send a String and convert using Jackson to a Date v.v.
        r = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX").format(zonedDateTime);


        ZonedDateTime back = ZonedDateTime.parse(r, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        System.out.println(back);

        String otherWayToGetBack = back.toString();
        System.out.println(otherWayToGetBack.equals(r));

    }
}
