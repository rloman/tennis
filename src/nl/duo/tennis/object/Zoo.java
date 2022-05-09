package nl.duo.tennis.object;

public class Zoo {

    private String name = "Wildland Emmen";
    private int aantalDieren = 105;

    public String toString() {
        return this.getClass().getSimpleName()+":"+name + ", heeft aantal dieren:" + aantalDieren;
    }

    public static void main(String[] args) {
        Zoo z = new Zoo();


        System.out.println(z);
        System.out.println(z.toString());


    }
}
