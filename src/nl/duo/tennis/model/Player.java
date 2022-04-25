package nl.duo.tennis.model;

public class Player {

    // eigenschappen, fields, instance variable(s)
    int aantalWedstrijdenGespeelt = 0;

    // get om de fields uit te lezen
    public int getAantalWedstrijdenGespeelt() {
        return aantalWedstrijdenGespeelt;
    }

    // business method
    public void playAMatch() {
        aantalWedstrijdenGespeelt = aantalWedstrijdenGespeelt + 1;
    }

}
