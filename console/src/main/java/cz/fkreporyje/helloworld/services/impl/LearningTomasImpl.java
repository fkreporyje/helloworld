package cz.fkreporyje.helloworld.services.impl;

import cz.fkreporyje.helloworld.services.Learning;

public class LearningTomasImpl implements Learning {

    @Override
    public String getFirstTwoLetters(String input) {
        return input.substring(0,2);
    }

    @Override
    public String getLastTwoLetters(String input) {
        return input.substring(input.length() - 2);
    }
}
