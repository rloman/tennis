package nl.duo.tennis.serialization;

import java.io.Serializable;

public class Runner  {

    private String name;
    private int maxDistance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
