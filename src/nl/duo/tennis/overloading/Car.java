package nl.duo.tennis.overloading;

public class Car {

    private double mileage;

    public void drive() {
        mileage++;
    }

    public void drive(int increment) {
        mileage += increment;
    }

    public boolean drive(String name) {
        return true;
    }

    public double getMileage() {
        return this.mileage;
    }
}
