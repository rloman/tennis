package nl.duo.tennis.regexp;

public class Ray {

    public static void main(String[] args) {

        String input = "112233aapnootmies 555 33";
//        String preformattedRegExp = ".*%d{2,}.*";
        String preformattedRegExp = ".*%d{2,}.*";

        for (int i = 1; i < 10; i++) {
            String regexp = String.format(preformattedRegExp, i);
            System.err.println(regexp);
            System.out.println(input.matches(regexp));
        }
    }
}
