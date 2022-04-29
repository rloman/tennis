package nl.duo.tennis.formatting;

import java.util.stream.IntStream;

public class StringFormatting {

    public static void main(String[] args) {

        String voornaam = "Raymond";
        String achternaam = "Loman";

        System.out.println("Mijn naam is: "+ achternaam +", "+ voornaam);
        System.out.printf("Mijn naam is: %s, %s%n", achternaam, voornaam);

        System.out.printf("Mijn naam is: %s, %s en mijn leeftijd is: %03d. %n",
                achternaam,
                voornaam, 53);
        System.out.printf("Mijn naam is: %s, %s en mijn leeftijd is: %03d. %n",
                achternaam,
                "Raymond", 6);

        String welkomstTekst = String.format("Mijn naam is: %s, %s en mijn leeftijd is: %03d. %n",
                achternaam,
                "Raymond", 6);

        System.out.println(welkomstTekst);

        double breuk =  12341.53434;

        // let op: 7 is hier de TOTALE lengte inclusief de digitale punt
        // en dat betekent hier dus 3 voor en 3 na de decimale punt
        // en bij overflow aan de linkerkant wordt het langer
        // ivm consistentie dus hier is het resultaat: 12341.534
        String label = String.format("Breuk is ongeveer %07.3f", breuk);
        System.out.println(label);

        breuk = .1;
        label = String.format("%2.3f", breuk);
        System.out.println(label);

        String [] teams = {"Heracles", "Ajax", "Feyenoord", "FC Groningen"};
        String[] other = {"Ajax", "FC Groningen", "Sparta", "Heracles"};
        for (int i = 0; i < teams.length; i++) {
            int home = Double.valueOf(Math.random() * 6 + 1).intValue();
            int out = Double.valueOf(Math.random() * 6 + 1).intValue();
            // - weglaten hier beneden is standaard right align string
            // met - dus left align (niet standaard)
            String uitslag =
                    String.format("%15s vs %-15s => %02d-%02d", teams[i], other[i], home, out);
            System.out.println(uitslag);
        }
    }
}
