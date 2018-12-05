package cz.fkreporyje.dao;

import cz.fkreporyje.model.AnimalModel;
import cz.fkreporyje.model.CarModel;

import java.util.List;

public interface ZooDao {
    void createAninamlRecord(AnimalModel animalModel);
    List<AnimalModel> getAllAnimals();
    void clearDatabase();

}
