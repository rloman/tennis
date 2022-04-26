package nl.duo.tennis.operators.booleans;

public class App {

    public static boolean isFemale() {
        return true;
    }

    public static void main(String[] args) {
        // Logical and

        boolean b = true & false;
        System.out.println(!b);
        b = true | false;
        System.out.println(b);

        b = true  | false | true | false; // standaard |

        b = true || false || true || isFemale(); // short-circuit operator (||)
        // roept alleen de overige operatoren aan als de machine het eindresultaat
        // nog niet kan afleiden

        System.out.println(b);

        b = false && true && false && true;



    }
    
}
