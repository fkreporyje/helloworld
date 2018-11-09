package cz.fkreporyje.helloworld;

import cz.fkreporyje.helloworld.services.ServiceTest;
import cz.fkreporyje.helloworld.services.impl.LearningRejzaImpl;
import cz.fkreporyje.helloworld.services.impl.LearningSvobodaImpl;
import cz.fkreporyje.helloworld.services.impl.LearningTomasImpl;
import cz.fkreporyje.helloworld.services.impl.ServiceTestImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.exit;
import static java.lang.System.setOut;


public class ConsoleApplication  {

    public static void main(String[] args) {
        try {
            ServiceTest serviceTest = new ServiceTestImpl();
            List<Integer> list = Arrays.asList(1,2,3,4,8,10,5,6);
            int maxValueFromList = serviceTest.returnMaxValueFromList(list);
            System.out.println(maxValueFromList);

        } catch (Exception ex) {

        } finally {
            exit(0);
        }
    }
}
