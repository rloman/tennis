package nl.duo.tennis.model;

import java.util.Objects;

public class Ball {

    // no access modifier ::= default access (package level)
    // d.w.z. iedereen in dezelfde package kan er bij
    int dummy;

    // om te laten zien dat je deze overal nu kunt benaderen.
    // De conventie is : private
    public int weight;
    private int color;
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("De ball class wordt nu opgeruimd ... ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;

        return weight == ball.weight && color == ball.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }
}
