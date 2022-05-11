package nl.duo.tennis.interfaces.marker;

import java.io.Serializable;

public class MarkerDemoClass implements Serializable {

    // what is in the interface Serializable. Noppes. Nada
    /*
    Serializable is a marker interface. Sometimes called a tag.
    Setting this (empty) interface to this class means that
    the Jvm can handle this class instances (objects) of type MarkerDemoClass to
    be able to serialise, send through the internet kabel etc.
     */
}
