package nl.duo.tennis.flowcontrol.ifelse;

public class Application {

    public static void main(String[] args) {

        double temperature = 22.3;

        //if statement in Java
        /*
        if(<booleanExpression>) {

            // body die wordt uitgevoerd als het resultaat onder if tot true evalueert
        } else {
            // body die wordt uitgevoerd als het resultaat onder if tot false evalueert
        }
         */

        boolean hetRegent = false;

        if (temperature > 25 || hetRegent || false) {
            System.out.println("Het is warm");
        } else {
            System.out.println("Het is fris");
        }

        if (hetRegent)
            System.out.println("Koop een paraplu");

            // Er staat soms een tab voor een regel in het examen maar dat is om
            // je om de tuin te leiden
            System.out.println("En wandel naar huis"); // let op voor indenting issues op het examen

        if (!hetRegent) System.out.println("Geen paraplu nodig");

        int hourOfDay = 22;
        if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if(hourOfDay < 11) {
            System.out.println("Good Morning"); // UNREACHABLE CODE
        } else {
            System.out.println("Good Evening");
        }


    }
}
