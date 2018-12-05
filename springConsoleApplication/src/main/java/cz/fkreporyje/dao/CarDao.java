package cz.fkreporyje.dao;

import cz.fkreporyje.model.CarModel;
import java.util.List;

public interface CarDao {
    List<CarModel>getAllCars();
    void createCarRecord(CarModel carmodel);
    void clearDatabase();

}
