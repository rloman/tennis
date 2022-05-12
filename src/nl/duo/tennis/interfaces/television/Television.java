package nl.duo.tennis.interfaces.television;

public interface Television {

    void on();  /*public abstract impliciet */
    void off();
    boolean switchChannel(int newChannel);
}
