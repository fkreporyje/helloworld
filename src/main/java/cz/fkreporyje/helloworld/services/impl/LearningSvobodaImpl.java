package cz.fkreporyje.helloworld.services.impl;

import cz.fkreporyje.helloworld.services.Learning;

public class LearningSvobodaImpl implements Learning {

    @Override
    public String getFirstTwoLetters(String input) {

        char[] g = input.toCharArray();
        for (int i = 0; i < 2; i++) {
            System.out.print(g[i] + "");
        }
        return "nic";
    }

    @Override
    public String getLastTwoLetters(String input) {
        char[] g = input.toCharArray();
        for (int i = g.length-2; i < g.length; i++) {
            System.out.print(g[i] + "");
        }
        return "nic";
        }
}
