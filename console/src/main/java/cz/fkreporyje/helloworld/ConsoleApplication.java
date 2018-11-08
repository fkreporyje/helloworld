package cz.fkreporyje.helloworld;

import cz.fkreporyje.helloworld.services.impl.LearningRejzaImpl;
import cz.fkreporyje.helloworld.services.impl.LearningSvobodaImpl;
import cz.fkreporyje.helloworld.services.impl.LearningTomasImpl;

import static java.lang.System.exit;
import static java.lang.System.setOut;


public class ConsoleApplication  {

    public static void main(String[] args) {
        try {

            System.out.println("Begin of program");


            //Kdybychom to měl implemetované tak uděláme a můžu si zkusit, že to krásně běhá
            LearningTomasImpl learning = new LearningTomasImpl();
            System.out.println("První dvě " + learning.getFirstTwoLetters("Řepo"));
            System.out.println("Poslední dvě " + learning.getLastTwoLetters("Řepo"));


            LearningSvobodaImpl svobodak=new LearningSvobodaImpl();
            System.out.println(svobodak.getFirstTwoLetters("Řeporyje"));
            System.out.println(svobodak.getLastTwoLetters("Řeporyje"));

            LearningRejzaImpl rejza=new LearningRejzaImpl();
            rejza.getFirstTwoLetters("jejda");
            rejza.getLastTwoLetters("hop");




            System.out.println("End of program");

        } catch (Exception ex) {

        } finally {
            exit(0);
        }
    }
}
