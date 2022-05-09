package nl.duo.tennis.blocks;

public class DirtyOne {

    public static int counter = 5;

    // als de class wordt gebruikt en dus ook echt wordt gebruikt ...
    static {
        System.out.println(1);
    }

    // als de class wordt geinstantieerd. WORDT AANGEROEPEN VOOR DE CONSTRUCTOR
    {
        System.out.println(2);
    }

    {
        // NOG 1
        System.out.println(3);

    }

    public DirtyOne() {
        System.out.println(4);
    }

}
