package nl.duo.tennis.formatting;

import java.util.stream.IntStream;

public class StringFormatting {

    public static void main(String[] args) {
        double pi = 341.53434;

        String label = String.format("%02.3f", pi);
        System.out.println(label);

        pi = .1;
        label = String.format("%2.3f", pi);
        System.out.println(label);

        String [] teams = {"Heracles", "Ajax", "Feyenoord", "FC Groningen"};
        String[] other = {"Ajax", "Feyenoord", "Heracles", "FC Groningen"};
        for (int i = 0; i < teams.length; i++) {
            int home = Double.valueOf(Math.random() * 6 + 1).intValue();
            int out = Double.valueOf(Math.random() * 6 + 1).intValue();
            // - weglaten hier beneden is standaard right align string
            // met - dus left align (niet standaard)
            String uitslag =
                    String.format("%-15s vs %-15s => %02d-%02d", teams[i], other[i], home, out);
            System.out.println(uitslag);
        }
    }
}
