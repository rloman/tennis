package nl.duo.tennis.inheritance.sub;

import nl.duo.tennis.inheritance.Animal;
import nl.duo.tennis.inheritance.Dog;

public class Butterfly extends Animal {

    private Animal a = new Animal();
    private Dog d = new Dog("Wodan");

    public Butterfly() {
        this.animalOnly(); // prima, want immers this (de Butterfly) is een animal
//        a.animalOnly(); // vout want: dit is gewoon een instance field en geen inheritance structuur
//                  je zou verwachten wellicht dat dit werkt en hier testen ze met het examen ook op
//                  maar je moet het zo zien alsof je een public static void main maakt met een variable er in 
//                  dan werkt het toch ook niet???
//        d.animalOnly(); // vout: zelfsde als vorige; a(nimal) of d(dog) doet er niet toe
    }
}
