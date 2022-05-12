package nl.duo.tennis.builder;

import java.awt.*;

public class Fornuis {

    private Color color;

    public Fornuis(Color fornuisColor) {
        this.color = fornuisColor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fornuis{" +
                "color=" + color +
                '}';
    }
}
