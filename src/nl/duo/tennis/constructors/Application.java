package nl.duo.tennis.constructors;

public class Application {

    public static void main(String[] args) {


        Car car = new Car("POEDEL");
        Car carZonderLicensePlate = new Car();

        System.out.println(car.getLicensePlate());
        System.out.println(carZonderLicensePlate.getLicensePlate());
    }
}
