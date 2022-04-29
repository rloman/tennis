package nl.duo.tennis.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {


    public static void main(String[] args) {
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        line = "ababab";
        pattern="([a-c]?){2,2}";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        String print = "Found value: >%s<%n";
        if (m.find( )) {
            System.out.printf(print, m.group(0) );
            System.out.printf(print, m.group(1) );
            System.out.printf(print,  m.group(2) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
