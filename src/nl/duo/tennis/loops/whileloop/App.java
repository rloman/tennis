package nl.duo.tennis.loops.whileloop;

public class App {

    public static void main(String[] args) {
        // While 0 of vaker

        System.out.println("While loop");
        int teller = 0;
        while(teller < 10) {
            System.out.println(teller++);
        }

        teller = 0;
        // do while: 1 of vaker
        System.out.println("Do ... while loop");
        do {
            System.out.println(teller);
        } while(teller++ < 10);  // let op de puntkomma


        System.out.println("En nu de for loop");

        // for loop
        /*
        for(<init stap>;<conditie>;<incrementStap>) {
            body
        }
         */
        for(int i = 0;i<10;i++) {
            System.out.println(i);
        }

        System.out.println("En nu met een continue in een for loop");
        teller = 0;
        // Idioom voor een oneindige loop
        for(teller = 3;teller < 25;teller++) {
            // continue om door te gaan en te springen naar de <increment step>
            if(teller == 13) {
                continue;
            }
            System.out.println(teller);
        }

        System.out.println("En nu met break");
        for(teller = 3;teller < 25;teller++) {
            // break om de gehele loop te beeindigen
            System.out.println(teller);
            if(teller == 13) {
                break;
            }
        }
        // daar springt nu de break heen

        // nested loops
        OUTER:
        for(int i = 1;i<=10;i++) {
            INNER:
            for(int j=1;j<=10;j++) {
                System.out.println(j+"x"+i+"="+(i*j));
                if(j == 6) {
                    break OUTER;
                }
            }
        }

        // FOR EACH

        // array =>
        int[] numbers = new int[]{11,25,31,45};

        for(int element : numbers) {
            System.out.println("Element van array: "+element);
        }
    }
}
