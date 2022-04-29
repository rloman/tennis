package nl.duo.tennis.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {
/*
Definities
stdin ::= lezen van de console, in java heet dat System.in
stdout::= printen naar de console, in Java heet dat System.out
stderr::= printen naar een foutscherm. Wordt rood als je hier iets naar print.
 */


    public static void main(String[] args) throws FileNotFoundException {
        readFromFile();
        readFromStdin();
    }

    private static void readFromFile() throws FileNotFoundException {

        // tries to read from stdin
        Scanner s = new Scanner(new File("inputfile.txt"));

        double d = s.nextDouble();
        String firstName = s.next();
        String lastName = s.next();
        boolean isMale = s.nextBoolean();

        System.out.printf("Name: %s, lastname: %s, sexe: %b, sexe: %s, rating: %f%n",
                firstName, lastName, isMale, isMale ? "Man" : "Vrouw", d);

        isMale = s.nextBoolean();

        System.out.printf("Name: %s, lastname: %s, sexe: %b, sexe: %s, rating: %f%n",
                firstName, lastName, isMale, isMale ? "Man" : "Vrouw", d);

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
