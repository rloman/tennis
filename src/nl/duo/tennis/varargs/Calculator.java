package nl.duo.tennis.varargs;

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
}
