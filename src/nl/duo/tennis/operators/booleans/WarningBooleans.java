package nl.duo.tennis.operators.booleans;

public class WarningBooleans {

    public static void main(String[] args) {

        boolean b = deBalIsUit();

        if(b == true) {
            System.out.println("De bal is uit");
        }

        // pas op
        if(b = true) { // dit assigned wijst toe dus ... de waarde true naar b
            System.out.println("De bal is op de tweede poging uit!");
        }

        // nu zou b dus false moeten zijn (assertion)
        System.out.println(b == false);

        int c = 3;
        /*
        if(c = 4) {
            // compile error!!!
        }
         */

    }

    private static boolean deBalIsUit() {

        return false;
    }
}
