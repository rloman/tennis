package nl.duo.tennis.interfaces;

public interface Television {

    void on();  /*public abstract impliciet */
    void off();
    boolean switchChannel(int newChannel);
}
