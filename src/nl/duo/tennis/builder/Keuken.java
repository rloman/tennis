package nl.duo.tennis.builder;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Keuken {

    private Fornuis fornuis;
    private Koelkast koelkast;
    private List<Pan> pannen = new ArrayList<>();

    private Keuken(KeukenBuilder keukenBuilder) {

        this.fornuis = new Fornuis(keukenBuilder.fornuisColor);
        this.koelkast = new Koelkast(keukenBuilder.koelkastMerk, keukenBuilder.koelkastMinTemperature);

        for (Pan element : keukenBuilder.pannen) {
            this.pannen.add(new Pan(element.getMerk(), element.isBakPan())); // Waarom moet dit? :-)
        }
    }

    public static class KeukenBuilder {

        private String merk;
        private String koelkastMerk;
        private double koelkastMinTemperature;
        private Color fornuisColor;

        private List<Pan> pannen = new ArrayList<>();


        public KeukenBuilder(String merk) {
            this.merk = merk;
        }

        public KeukenBuilder metKoelkastMerk(String koelkastMerk) {
            this.koelkastMerk = koelkastMerk;
            return this;
        }

        public KeukenBuilder metFornuisColor(Color fornuisColor) {
            this.fornuisColor = fornuisColor;
            return this;
        }

        public KeukenBuilder metKoelkastMinTemperature(double koelkastMinTemperature) {
            this.koelkastMinTemperature = koelkastMinTemperature;
            return this;
        }

        public KeukenBuilder addPan(String merk, boolean bakPan) {

            this.pannen.add(new Pan(merk, bakPan));

            return this;
        }

        public Keuken build() {
            return new Keuken(this);
        }
    }

    public String toString() {
        return "Keuken{" +
                "fornuis=" + fornuis +
                ", koelkast=" + koelkast +
                ", pannen=" + pannen +
                '}';
    }
}
