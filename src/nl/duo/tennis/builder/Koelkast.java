package nl.duo.tennis.builder;

public class Koelkast {

    private String merk;
    private double minTemperature;

    public Koelkast(String koelkastMerk, double koelkastMinTemperature) {
        this.merk = koelkastMerk;
        this.minTemperature = koelkastMinTemperature;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    @Override
    public String toString() {
        return "Koelkast{" +
                "merk='" + merk + '\'' +
                ", minTemperature=" + minTemperature +
                '}';
    }
}
