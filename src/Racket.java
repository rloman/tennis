public class Racket {

    // field == instance variable
    int weight;
    int tension;


    public int getWeight() {
        return weight;
    }

    // Hier is 'mijnGewicht' de 'parameter'
    public void setWeight(int mijnGewicht) {
        weight = mijnGewicht;
    }

    public int getTension() {
        return tension;
    }

    // tension ::= locale variable
    // this.tension ::= field
    public void setTension(int tension) {
        this.tension = tension;
    }
}
