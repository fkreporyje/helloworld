package cz.fkreporyje.database;

import cz.fkreporyje.model.CarModel;

import java.util.List;

public interface CarDatabaseInterface {
    void insertCarToDatabase(CarModel carModel);
    void clearDatabasee();
    List<CarModel> getallCarsFromDatabase_02();

}
