package nl.duo.tennis.varargs;

import java.util.Arrays;

public class Calculator {

    public static int max(int first, int... rest) {

        int max = first;
        for (int i = 0; i < rest.length; i++) {
            if(rest[i] > max) {
                max = rest[i];
            }
        }

        return max;
    }

    // hartstikke vout
    /*
    public static void error(int... numbers, String... names) {

    }
     */

    public static void printNames(String firstName, String... otherMembers) {

        System.out.print(firstName);
        for (String other : otherMembers) {
            System.out.print(", "+other);
        }
        System.out.println();

        System.out.println(otherMembers);

        System.out.println(Arrays.toString(otherMembers));
    }
}
