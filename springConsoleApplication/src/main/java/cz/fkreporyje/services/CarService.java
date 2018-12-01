package cz.fkreporyje.services;

import cz.fkreporyje.model.CarModel;

import java.util.List;

public interface CarService {
    String onlyForTest(String s);
    List<CarModel> getEveryCar();
    int getSpeed(String vstup);
}
