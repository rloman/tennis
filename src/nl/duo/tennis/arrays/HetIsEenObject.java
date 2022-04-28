package nl.duo.tennis.arrays;

import java.util.Arrays;

public class HetIsEenObject {

    public static void main(String[] args) {
        int [] fibon = {0,1,1,2,3,5,8,13,21,34,55,89};

        bar(fibon);

        System.out.println(fibon);

        for (int element : fibon) {
            System.out.println(element);
        }
    }

    public static void bar(Object o) {

    }
}
