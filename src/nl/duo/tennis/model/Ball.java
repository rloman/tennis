package nl.duo.tennis.model;

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
}
