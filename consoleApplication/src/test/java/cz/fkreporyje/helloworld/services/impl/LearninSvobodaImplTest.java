package cz.fkreporyje.helloworld.services.impl;

import cz.fkreporyje.helloworld.services.Learning;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LearninSvobodaImplTest {

    Learning svoboda = new LearningSvobodaImpl();

    @Test
    public void zobrazujePosledniDvePismena(){
        assertEquals("je", svoboda.getLastTwoLetters("Řeporyje"));
    }

    @Test
    public void zobrazujePrvniDvePismena(){
        assertEquals("Ře", svoboda.getFirstTwoLetters("Řeporyje"));
    }
}
