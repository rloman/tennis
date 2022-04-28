package nl.duo.tennis.String;

import nl.duo.tennis.model.Ball;

public class App {

    public static void main(String[] args) {
        // Dit komt dus op de constant pool hieronder =>

        String v = "Tom";
        String v2 = "Tom";
        String v3 = "Tom";

        v = "Wim"; // dit noemen we een literal String

        System.out.println(v);
        System.out.println(v2);
        System.out.println(v3);

        Ball b = new Ball();
        String v4 = new String();
        v = "Frans";
        v = "Frans"+3;
        v = "Willem de vierde";
        v = "Koning Willem de vierde";

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            stringBuilder.append(i);
        }
        String longString = stringBuilder.toString();
        String anotherString = stringBuilder.toString();

        System.out.println(longString != anotherString);
        System.out.println(longString.equals(anotherString));

        // intern.Werkt WEL vanaf java 8
        String dezeKomtDusWelOpDeConstantPool = v4.intern();

        String intern1 = longString.intern();
        String intern2 = anotherString.intern();

        System.out.println(intern1 == intern2);
        System.out.println(intern1.equals(intern2)); // altijd true als == true is
    }
}
