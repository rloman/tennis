package nl.duo.tennis.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {
/*
Definities
stdin ::= lezen van de console, in java heet dat System.in
stdout::= printen naar de console, in Java heet dat System.out
stderr::= printen naar een foutscherm. Wordt rood als je hier iets naar print.
 */


    public static void main(String[] args) {
        readFromStdin();
    }

    private static void readFromStdin() {
        // tries to read from stdin
        Scanner s = new Scanner(System.in);

        System.out.println("Voer een double in");
        // leest double en als je wat anders invoert knalt ie
        double age = s.nextDouble();
        System.out.println(age);

        // lees wat anders
        System.out.println("Bent u fan van Derksen (true/false) =>");
        boolean fanVanDerksen = s.nextBoolean();

        if (fanVanDerksen) {
            System.out.println("Ja zeker fan van Derksen");
        } else {
            System.out.println("Tuurlijk niet");
        }

        // soort van ididoom om getal als rapportcijfer in te voeren
        int input = -1;
        do {
            System.out.print("Voer een rapportcijfer in (1 t/m 10) => ");
            try {
                input = s.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Dat is geen cijfer");
                s = new Scanner(System.in);
            }
        } while(input <1 || input > 10);

        System.out.println("Rapportcijfer is: " + input);
    }
}
