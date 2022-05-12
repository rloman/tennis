package nl.duo.tennis.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        int[] numbers = {31, 12,24, 8, 17, 2};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(numbers));

        List<String> names = Arrays.asList("Jeroen", "Willem", "Jaap");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

    }
}
