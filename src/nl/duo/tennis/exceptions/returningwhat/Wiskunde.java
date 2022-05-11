package nl.duo.tennis.exceptions.returningwhat;

import nl.duo.tennis.exceptions.KanNietDoorNulDelenException;

public class Wiskunde {

    public static int divide(int n, int m, String s) throws KanNietDoorNulDelenException {
        if (m != 0) {
            System.out.println(s.length());
            return n/m;
        } else {
            throw new KanNietDoorNulDelenException();
        }
    }

    // als je deze aanroept dan krijg je dus uiteindelijk een NPE (Null Pointer Exception)
    public static int divide(int n, int m) throws KanNietDoorNulDelenException {

        return divide(n, m, null);
    }
}
