package cz.fkreporyje.helloworld;

import java.util.Arrays;
import java.util.List;

import cz.fkreporyje.helloworld.services.ServiceTest;
import cz.fkreporyje.helloworld.services.impl.ServiceTestImpl;

import static java.lang.System.exit;


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
