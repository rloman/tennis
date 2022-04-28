package nl.duo.tennis.stringbuilder;

public class Comparing {


    public static void main(String[] args) {
        StringBuilder poedelBuilder = new StringBuilder();
        poedelBuilder.append("Poe");
        poedelBuilder.append("del");

        String first = poedelBuilder.toString();
        String second = poedelBuilder.toString();

        System.out.println(first != second);

        String p1 = "Poedel";
        String p2 = "Poedel";
        System.out.println(p1 == p2);

        p1 = new String("Otje");
        p2 = new String("Otje");
        System.out.println(p1 != p2);
    }
}
