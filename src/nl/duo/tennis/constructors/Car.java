package nl.duo.tennis.constructors;

public class Car {

    private String licensePlate;

    // default constructor is generated ONLY
    // when there is NO OTHER constructor
    public Car() {
        this.licensePlate = "Onbekend";
    }

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }





    public String getLicensePlate() {
        return licensePlate;
    }
}
