package nl.duo.tennis.statics.constants;

public class App {

    public static void main(String[] args) {
        System.out.println(Constants.COMPANY_NAME);

//        Constants.companyName = "DUO"; // gaat nu fout

        System.out.println(Constants.COMPANY_NAME);

        System.out.println(Constants.VATPERCENTAGE);

//        Constants.VATPERCENTAGE = 21.0; // kan dus niet

        
        // laat zien dat eerst de initblocks en dan de constructor wordt gerund
        Constants c = new Constants();

    }
}
