package cz.fkreporyje;

import cz.fkreporyje.services.CarService;
import cz.fkreporyje.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConsoleApplication implements CommandLineRunner {

    @Autowired
    ZooService zooService;

    @Autowired                  //Svoboda
    CarService carService;      //Svoboda

    public static void main(String[] args) {
        System.out.println("STARTING THE APPLICATION");
        SpringApplication.run(SpringConsoleApplication.class, args);
        System.out.println("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        System.out.println(carService.onlyForTest("Svododákův test"));      //Svoboda
        String s = zooService.onlyForTest("test");
        System.out.println(s);


    }
}
