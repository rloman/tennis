package nl.duo.tennis.model;


import java.util.Date;
import java.sql.*;


public class Player {

    private String name;
    private Date birthDate;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
