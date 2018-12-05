package cz.fkreporyje.services.impl;

import cz.fkreporyje.dao.CarDao;
import cz.fkreporyje.model.CarModel;
import cz.fkreporyje.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDao carDao;



    @Override
    public void createCar(CarModel carModel){
        carDao.createCarRecord(carModel);
    }

    @Override
    public List <CarModel> getAllCarsFromDatabase() {
        return carDao.getAllCars();
    }

    @Override
    public void clearDatabase(){
        carDao.clearDatabase();
    }



}
