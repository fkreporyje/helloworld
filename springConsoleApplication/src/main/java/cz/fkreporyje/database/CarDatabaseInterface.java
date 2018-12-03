package cz.fkreporyje.database;

import cz.fkreporyje.model.CarModel;

public interface CarDatabaseInterface {
    void createTextDatabase();
    void createCarRecord(CarModel carModel);
    void readCarRecord(String TextFile);
}
