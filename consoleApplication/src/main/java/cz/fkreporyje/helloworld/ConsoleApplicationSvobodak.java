package cz.fkreporyje.helloworld;

import cz.fkreporyje.helloworld.services.Learning;
import cz.fkreporyje.helloworld.services.impl.LearningSvobodaImpl;


public class ConsoleApplicationSvobodak {
    public static void main(String[] args) {

        Learning svoboda = new LearningSvobodaImpl();
        System.out.println(svoboda.getFirstTwoLetters("Řeporyje"));
        System.out.println(svoboda.getLastTwoLetters("Řeporyje"));
    }
}
