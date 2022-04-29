package nl.duo.tennis.constants;

public class Constants {


    // constante is in Java met 'final'
    public static final String COMPANY_NAME = "Bytesnet";

    public static final double VATPERCENTAGE;

    // kan meerdere static blokjes

    // maar mooi is anders ... maar gebruik het net als bier met mate
    static {
        System.out.println("static Blokje 1");
        VATPERCENTAGE = Math.PI * 3.5;
    }

    static { System.out.println("static Blokje 2");}

    static {System.out.println("static Blokje 3");}

    {
        System.out.println("init block 1");
    }

    {
        System.out.println("init block 2");
    }

    {
        System.out.println("init block 3");
    }

    public Constants(){
        System.out.println("in de constructor");
    }
}
