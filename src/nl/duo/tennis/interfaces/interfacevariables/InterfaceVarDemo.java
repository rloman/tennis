package nl.duo.tennis.interfaces.interfacevariables;

public interface InterfaceVarDemo {

    /*public static final */ int AGE = 45;
    double BTW = 21.0;
    public static final double PRICE = 45.3; // public static final is here redundant

    void foo();

    default void bar() {
        System.out.println("Stiekem toch mogelijk want men had er spijt van ... ");
    }
}
