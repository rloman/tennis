package nl.duo.tennis.scoping;

public class Scoper {

    private String name = "Demo scoper";

    public void foo() {
        int age = 45;

        {
            System.out.println(age); // werkt want age is OOK bekend in dit block
        }
    }


    public  void bar() {
        System.out.println(name);
//        System.out.println(age); // vout
    }

    public void anotherBar() {
        {
            int aantal = 14;
            aantal++;
            System.out.println(aantal == 15);
        }

        {
            int aantal = 33;
            aantal++;
            System.out.println(aantal == 34);
        }
    }
}
