package nl.duo.tennis.flowcontrol.switching;

public class Switch {

    public static void main(String[] args) {
        int aantalDagenVanApril = geefAantalDagenVanDeMaandIf(4);
        aantalDagenVanApril = geefAantalDagenMetSwitch(4);
        System.out.println("Aantal dagen april: " + aantalDagenVanApril);

        int aantalDagenVanFebruari = geefAantalDagenMetSwitch(2);
        System.out.println("Aantal dagen feb: " + aantalDagenVanFebruari);

    }

    public static int geefAantalDagenMetSwitch(int maand) {
        int result = -1;
        switch (maand) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                // Zonder break noemen we dit een 'fall through'
                break;
            case 2:
                result = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            default:
                result = -1;
                break;
        }
        return result;
    }

    public static int geefAantalDagenVanDeMaandIf(int maand) {

        // met if else
        if (maand == 1) {
            return 31;
        } else {
            if (maand == 2) {
                return 28;
            } else if (maand == 3) {
                return 31;
            } else if (maand == 4) {
                return 30;
            }
        }

        return -1;
    }
}
