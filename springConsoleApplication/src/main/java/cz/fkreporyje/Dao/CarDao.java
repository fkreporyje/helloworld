package cz.fkreporyje.Dao;

import cz.fkreporyje.model.CarModel;

import java.util.ArrayList;

public interface CarDao {
    void addCar(CarModel carmodel);
    ArrayList<CarModel>getEveryCar();
}
