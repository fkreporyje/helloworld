package cz.fkreporyje.helloworld;

import cz.fkreporyje.helloworld.services.impl.LearningSvobodaImpl;
import cz.fkreporyje.helloworld.services.impl.LearningTomasImpl;

import static java.lang.System.exit;


public class ConsoleApplication  {

    public static void main(String[] args) {
        try {

            System.out.println("Begin of program");
            System.out.println("End of program");

            //Kdybychom to měl implemetované tak uděláme a můžu si zkusit, že to krásně běhá
            //LearningTomasImpl learning = new LearningTomasImpl();


            //Svobodak
            LearningSvobodaImpl learning2=new LearningSvobodaImpl();
            learning2.getFirstTwoLetters("Řeporyje");
            System.out.println(" ");                                         //konec odstavce :/ (bohužel nevim, jak to udělat správně)
            learning2.getLastTwoLetters("Řeporyje");



        } catch (Exception ex) {

        } finally {
            exit(0);
        }
    }
}
