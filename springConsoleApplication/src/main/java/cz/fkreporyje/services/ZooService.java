package cz.fkreporyje.services;

import cz.fkreporyje.model.AnimalModel;

import java.util.List;

// Tomáš Vodslon
public interface ZooService {
    void createAnimal(AnimalModel animalModel);
    List<AnimalModel> getAllAnimalFromDatabase();
    void clearDatabase();
}
