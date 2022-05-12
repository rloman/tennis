package nl.duo.tennis.builder;

import java.awt.*;

public class App {

    public static void main(String[] args) {
        Keuken keuken = new Keuken.KeukenBuilder("Avigo")
                .metKoelkastMerk("Struis")
                .metKoelkastMinTemperature(-20)
                .metFornuisColor(Color.gray)
                .addPan("Pannenmerk", true).build();

        System.out.println(keuken);
    }
}
