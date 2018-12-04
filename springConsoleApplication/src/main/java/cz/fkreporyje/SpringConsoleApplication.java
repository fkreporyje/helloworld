package cz.fkreporyje;

import cz.fkreporyje.model.AnimalModel;
import cz.fkreporyje.services.CarService;
import cz.fkreporyje.services.ShoopService;
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

    @Autowired
    ShoopService shoopService; // Rejža

    public static void main(String[] args) {
        System.out.println("STARTING THE APPLICATION");
        SpringApplication.run(SpringConsoleApplication.class, args);
        System.out.println("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {

        // voci začátek kodu

        AnimalModel elza = new AnimalModel();
        elza.setName("Elza");
        elza.setAge(10);
        zooService.createAnimal(elza);

        AnimalModel ferda = new AnimalModel();
        ferda.setName("Ferda");
        ferda.setAge(5);
        zooService.createAnimal(elza);

        for (AnimalModel animalModel : zooService.getAllAnimalFromDatabase()) {
            System.out.println("Jméno zvířete : " + animalModel.getName() + " věk zvířete :" + animalModel.getAge());
        }


        // tady to si pustím jenom když chci smazat databázi
        //zooService.clearDatabase();

        // voci konec kodu

        System.out.println(carService.onlyForTest("Svododákův test"));      //Svoboda


        System.out.println(carService.getSpeed("Š"));    //Svoboda

        System.out.println(shoopService.onlyForTest("Rejžův test"));
        String z = shoopService.onlyForTest("zkouška");
        System.out.println(z);
    }

}
