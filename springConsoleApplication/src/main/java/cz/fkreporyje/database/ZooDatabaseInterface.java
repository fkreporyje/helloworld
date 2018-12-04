package cz.fkreporyje.database;

import cz.fkreporyje.model.AnimalModel;

import java.util.List;

public interface ZooDatabaseInterface {

    void insertAnimalToDatabase(AnimalModel animalModel);
    List<AnimalModel> getAllAnimalFromDatabase();
    void clearDatabase();
}
