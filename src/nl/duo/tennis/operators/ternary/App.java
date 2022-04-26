package nl.duo.tennis.operators.ternary;

public class App {

    public static void main(String[] args) {

        int age = 45;

        String hetLabel;
        if(age < 50) {
            hetLabel = "Jong";
        } else {
            hetLabel = "Oudere";
        }

                // 1: conditie
                // 2: ? de waarde als het true is
                // 3: : de waarde als het false is
        String label = age < 50 ? "Jong" : "Oudere";
    }
}
