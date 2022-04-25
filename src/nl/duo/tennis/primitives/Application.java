package nl.duo.tennis.primitives;

public class Application {

    public static void main(String[] args) {
        // integrale types
        byte age = 127;

        byte minimumAge = -128;

        // short
        short age2 = 32767;

        // int
        int ageInt = 45;

        System.out.println(1894758345725L);

        // floats
        float benzineTankInhoud = 4.75F;

        double benzineTankVanEenAndereAuto = 55.33;

        // char

        char letter = 'A';

        // boolean
        boolean hetIsLeukInGroningen = true;

        boolean isAcht = (3 + 5 == 8);
        if (3 + 5 == 8) {
            System.out.println("Ja, drie + vijf is acht");
        }
        // anomalies, gekke dingen

        byte otherAge = 127;
        otherAge++;
        System.out.println(otherAge);

        short max = 32767;
        max++;
        System.out.println(max);

        int maxInt = 2147483647;
        maxInt = maxInt + 1;
        System.out.println(maxInt);
    }
}
