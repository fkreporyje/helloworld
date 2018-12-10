package cz.fkreporyje.database;

import cz.fkreporyje.model.CarModel;

import java.util.List;

public interface CarDatabaseInterface {
    void insertCarToDatabase(CarModel carModel);
    List<CarModel> getAllCarsFromDatabase();
    void clearDatabasee();
    String getallCarsFromDatabase_02();

}
