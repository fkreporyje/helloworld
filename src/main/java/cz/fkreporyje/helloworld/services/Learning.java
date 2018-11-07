package cz.fkreporyje.helloworld.services;

public interface Learning {

    /**
     * Metoda by měla vrátit první dvě písmena z libovolného slova
     */
    String getFirstTwoLetters(String input);

    /**
     * Metoda by měla vrátit poslední dvě písmena z libovolného slova
     */
    String getLastTwoLetters(String input);

}
