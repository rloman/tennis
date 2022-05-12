package nl.duo.tennis.string;

public class MethodsOfString {

    public static void main(String[] args) {
        String a = "Animals";

        System.out.println('m' == a.charAt(3));
        System.out.println(a.length() == 7);

        int indexOfMal = a.indexOf("mal");
        System.out.println(3 == indexOfMal);
        System.out.println(-1 == a.indexOf("bestaatniet"));

        System.out.println(a.substring(2,5));

        a = "Animals";

        a = a.toUpperCase();
        System.out.println(a);

        System.out.println(a.equals("ANIMALS"));
        System.out.println(false == a.equals("Animals"));
        System.out.println(true == a.equalsIgnoreCase("AnIMals"));
    }
}
