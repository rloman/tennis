package nl.duo.tennis.access.staticimports;

//import static java.lang.Integer.*;
//import static java.lang.Long.*;


import static java.lang.Math.PI;

public class App {

    public static void main(String[] args) {


//        System.out.println(MAX_VALUE); // undetermenistic
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(PI);

        double r = 15;

        double omtrek = 2 * PI;
        double opp = PI * Math.pow(r, 2);

    }
}
