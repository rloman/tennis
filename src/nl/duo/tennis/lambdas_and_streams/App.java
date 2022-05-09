package nl.duo.tennis.lambdas_and_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        // zonder lambdas. ik wil een list met alleen even getallen hebben van
        // een andere lijst

        List<Integer> fibon = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 110);
        System.out.println(fibon);

        // nu alleen de even getallen
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int element : fibon) {
            if (element % 2 == 0) {
                evenNumbers.add(element);
            }
        }
        System.out.println(evenNumbers);

        // Met Lambda expressies // printen
        fibon.stream().filter(n -> n % 2 == 0).forEach(n -> {
            System.out.println(n);
        });

        // en nu wil ik een list
        System.out.println("Met Collector (hoef je niet te leren)");
        List<Integer> filteredEvenNumbers = fibon.
                stream().
                filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredEvenNumbers);


        fibon.
                stream().
                filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .filter(n -> n < 50)
                .forEach(n -> {
                    System.out.println(n);
                });

        long aantal = fibon.
                stream().
                filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .filter(n -> n < 50)
                .count();
        System.out.println("Het aantal ingefilterde is: " + aantal);
    }
}
