package nl.duo.tennis.serialization;

import java.io.Serializable;

public class Runner implements Serializable {  // see what happens if you remove 'implements ...'

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
