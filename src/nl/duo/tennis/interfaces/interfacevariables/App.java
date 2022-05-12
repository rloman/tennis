package nl.duo.tennis.interfaces.interfacevariables;

public class App {

    public static void main(String[] args) {
        InterfaceVarDemo demo = new InterfaceVarDemoRunner();
        System.out.println(demo.AGE);
        System.out.println(demo.BTW);

        System.out.println(new Poedel().AGE);

        new Poedel().bar();
        demo.bar();
    }
}

