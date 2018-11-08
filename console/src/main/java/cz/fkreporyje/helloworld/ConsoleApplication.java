package cz.fkreporyje.helloworld;

import cz.fkreporyje.helloworld.services.impl.LearningRejzaImpl;
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



            LearningSvobodaImpl svobodak=new LearningSvobodaImpl();
            System.out.println(svobodak.getFirstTwoLetters("Řeporyje"));
            System.out.println(svobodak.getLastTwoLetters("Řeporyje"));

            LearningRejzaImpl rejza=new LearningRejzaImpl();
            rejza.getFirstTwoLetters("jejda");
            System.out.println(" ");
            rejza.getLastTwoLetters("hop");

        } catch (Exception ex) {

        } finally {
            exit(0);
        }
    }
}
