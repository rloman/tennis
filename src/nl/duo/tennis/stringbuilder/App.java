package nl.duo.tennis.stringbuilder;

import nl.duo.tennis.model.Ball;

public class App {

    public static void main(String[] args) {
        StringBuilder alphaBuilder = new StringBuilder();

        for(char current = 'a';current <= 'z'; current++){
            alphaBuilder.append(current);
        }

        String alfabet = alphaBuilder.toString();
        System.out.println(alfabet);
        alphaBuilder.reverse().delete(4,6);

        String result = alphaBuilder.toString();
        System.out.println(result);
    }
}
