package nl.duo.tennis.operators;

public class App {

    public static void main(String[] args) {
        int i = 0;

        System.out.println(i); // 0
        System.out.println(i++);  // print en verhoogt daarna
        System.out.println(i);

        System.out.println(++i); // verhoogt met 1 en print daarna

        // meer over increment en decrement
        int a = 15;
        a += 3; // is hetzelfde als: a = a + 3;
        a -= 2; // is hetzelfde als a = a -2 ;
        // geldt ook voor de * en de /
        a /= 2; // is: a = a / 2;
        a /= 2;

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x); // Wij denken 2:
        System.out.println("y is " + y);// Wij denken 7!

        int c = 5 | 3;
        System.out.println(c);

        // booleans
        boolean drinkBeer = true;
        boolean drinkWine = !drinkBeer; // ! is de boolean NOT operator

        int age = 18;
        if (!(age >= 18)) { // kan ook met age < 18 maar het gaat hier om de '1' operator
            System.out.println("U mag niet op de markt staan!");
        }

//        long t = 192301398193810323; // DOES NOT COMPILE
        System.out.println(192301398193810323L); // moet een L (el) achter

        short yVoutje = (short) 1921222; // Stored as 20678
        System.out.println(yVoutje);

        int myAge = 53;

        if (myAge == 53) { // == check of de INHOUD van de variabele gelijk is aan de tweede operand
            System.out.println("U bent drieenvijftig");
        }

        if (myAge != 53) { // != is ongelijk aan
            System.out.println("U bent geen drieenvijftig");
        }
    }
}
