package cz.fkreporyje.helloworld;

import cz.fkreporyje.helloworld.services.impl.LearningSvobodaImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cz.fkreporyje.helloworld.services.impl.LearningTomasImpl;

import static java.lang.System.exit;

@Component
public class ConsoleApplication implements CommandLineRunner {


    /**
     * Tady si budete zkoušet Váš kod :)
     */
    @Override
    public void run(String... args) throws Exception {
        try {

            System.out.println("Begin of program");
            System.out.println("End of program");

            //Kdybychom to měl implemetované tak uděláme a můžu si zkusit, že to krásně běhá
            //LearningTomasImpl learning = new LearningTomasImpl();


            //Svobodak
            LearningSvobodaImpl learning2=new LearningSvobodaImpl();
            learning2.getFirstTwoLetters("řeporyje");
            System.out.println(" ");                                         //konec odstavce :/ (bohužel nevim, jak to udělat správně)
            learning2.getLastTwoLetters("řeporyje");



        } catch (Exception ex) {

        } finally {
            exit(0);
        }
    }
}
