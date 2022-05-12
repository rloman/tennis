package nl.duo.tennis.arrays;

public class App {

    public static void main(String[] args) {
        int [] fibon = {0,1,1,2,3,5,8,13,21,34,55,89};

        bar(fibon); // dit kan want onthoud ... een Array (int[]) is een Object instance

        System.out.println(fibon);

        for (int element : fibon) {
            System.out.println(element);
        }
    }

    public static void bar(Object o) {

    }
}
