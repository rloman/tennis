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
        // tries to read from stdin
        Scanner s = new Scanner(System.in);

        System.out.println("Voer een float in");
        // leest int en als je wat anders invoert knalt ie
        double age = s.nextDouble();
        System.out.println(age);


        System.out.println("Voer een rapportcijfer in (1 t/m 10");
        // soort van ididoom om getal als rapportcijfer in te voeren
        int input = -1;
        while (input <1 || input > 10) {
            do {
                try {
                    input = s.nextInt();
                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("Dat is geen cijfer");
//                    s = new Scanner(System.in);
                    continue;
                }
            }while(input == -1);
        }
    }
}
