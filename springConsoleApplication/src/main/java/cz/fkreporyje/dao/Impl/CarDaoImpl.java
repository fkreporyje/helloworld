package cz.fkreporyje.dao.Impl;

import cz.fkreporyje.dao.CarDao;
import cz.fkreporyje.database.CarDatabaseInterface;
import cz.fkreporyje.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CarDaoImpl implements CarDao {

    @Autowired
    CarDatabaseInterface carDatabaseInterface;


    @Override
    public List<CarModel> getAllCars(){
        return carDatabaseInterface.getAllCarsFromDatabase();
    }

    @Override
    public void createCarRecord(CarModel carModel){
        carDatabaseInterface.insertCarToDatabase(carModel);
    }

    @Override
    public void clearDatabase(){
        carDatabaseInterface.clearDatabasee();
    }


    //ArrayList<CarModel> databaseOfCars = new ArrayList<>();



}
