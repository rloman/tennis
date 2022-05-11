package nl.duo.tennis.exceptions.returningwhat;

import nl.duo.tennis.exceptions.KanNietDoorNulDelenException;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        demoStandaardFlow();
        demoShowingFinally();
        demoHandle();
    }

    // toont een standaard exception flow
    private static int demoStandaardFlow() {
        int result = 0;
        try {
            result = Wiskunde.divide(4, 2, "OK");
        } catch (KanNietDoorNulDelenException e) {
            System.out.println("Fout!");

            return -1;


        }
        return result;
    }

    private static int demoShowingFinally() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int n = s.nextInt();
        System.out.println("Enter another number: n");
        int m = s.nextInt();
        int result;
        try {
            result = Wiskunde.divide(n, m, "OK");
        } catch (KanNietDoorNulDelenException kndnde) {
            // als het fout gaat dan kom ik hier
            System.out.println("He, dat kan niet man, je kunt niet door nul delen");
            result = -1;
        }
        // als het goed gaat, en als het catch block is beeindigd ga ik hier verder
        // en ja, finally wordt nog uitgevoerd voordat de method returned
        finally {
            // Wat er ook gebeurt ...,  het sluiten van een file, het toch returnen van een waarde.
            // => In dit voorbeeld het sluiten van de scanner. (dat zou dus ook een File kunnen zijn (File is OCP lesstof)
            s.close();
        }

        return result;
    }

    private static void demoHandle() {
        // topic: Handle or Declare // dit is een handle want ik probeer het op telossen met een try block
        int result;
        try {
            result = Wiskunde.divide(8, 1); // gaat vout
        } catch (KanNietDoorNulDelenException | NullPointerException | ClassCastException e) {
            System.out.println("delen door nul is flauwekul");
        }
    }

    private static int demoDeclare() throws KanNietDoorNulDelenException {
        // topic: Handle or Declare // dit is een declare want ik gooi de exception omhoog de call stack op als het fout gaat
        int result;
        result = Wiskunde.divide(8, 1);

        return result;
    }
}