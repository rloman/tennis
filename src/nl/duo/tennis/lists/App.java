package nl.duo.tennis.lists;

import nl.duo.tennis.model.Ball;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList lijst = new ArrayList();

        lijst.add("Dog");
        lijst.add("Cat");
        lijst.add(new Ball());

        Object name = lijst.get(0);
        System.out.println(name.equals("Dog"));

        // vanaf Java 5 => 7 (Diamond Operator)
        ArrayList<String> cityNames = new ArrayList<>();
        cityNames.add("Almelo");
        cityNames.add("Groningen");
//        names.add(new Ball()); // vout

        String city = cityNames.get(1);

        for (String nameElement : cityNames) {
            System.out.println("Cityname: " + nameElement);
        }
    }
}
