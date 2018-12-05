package cz.fkreporyje.services;

import cz.fkreporyje.model.AnimalModel;
import cz.fkreporyje.model.CarModel;

import java.util.List;

public interface CarService {
    void createCar(CarModel carModel);
    List<CarModel> getAllCarsFromDatabase();
    void clearDatabase();
}
