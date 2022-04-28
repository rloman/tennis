package nl.duo.tennis.varargs;

public class App {

    public static void main(String[] args) {

        int grootste = Calculator.max(3, 12, 14, 38, 44);
        System.out.println(grootste == 14);

        grootste = Calculator.max(4);
        System.out.println(grootste == 4);

        grootste = Calculator.max(18);
        System.out.println(grootste);

        Calculator.printNames("Tom", "David", "Sebastiaan", "Annelot");
    }
}
