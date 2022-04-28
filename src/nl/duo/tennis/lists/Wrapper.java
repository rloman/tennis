package nl.duo.tennis.lists;

import java.util.ArrayList;

public class Wrapper {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // start: dit hoef jij niet te doen
        numbers.add(new Integer(3));

        Integer element = numbers.get(0);

        int i = element.intValue();
        // eind, dit hoef jij niet te doen

        System.out.println(i);

        numbers.add(5);

        System.out.println(6 == numbers.get(0)+1);


        // Integer class heeft utility method
        String invoerVanuitEenWebSchermBijDuo = "8765";
        int j = Integer.parseInt(invoerVanuitEenWebSchermBijDuo);
        System.out.println(j + 1);






        /*
        byte => Byte
        short => Short
        int => Integer
        long => Long

        float => Float
        double => Double

        boolean => Boolean

        char => Character
         */
    }
}
