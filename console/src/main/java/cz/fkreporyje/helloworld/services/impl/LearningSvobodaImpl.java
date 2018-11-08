package cz.fkreporyje.helloworld.services.impl;

import cz.fkreporyje.helloworld.services.Learning;

public class LearningSvobodaImpl implements Learning {


    public String getFirstTwoLetters(String input) {
        String x="";
        char[]g = input.toCharArray();
        for (int i = 0; i < 2; i++) {
            x+=String.valueOf (g[i]);
        }
        return x;
    }


    public String getLastTwoLetters(String input) {
        String y="";
        char[]g = input.toCharArray();
        for (int i = g.length-2; i < g.length; i++) {
            y+=String.valueOf (g[i]);
        }
        return y;
        }
}
