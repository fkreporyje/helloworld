package cz.fkreporyje.services.impl;

import cz.fkreporyje.Dao.CarDao;
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
    public List<CarModel> getEveryCar() {
        return carDao.getEveryCar();
    }


    @Override
    public void addCar(CarModel carmodel) {
        carDao.addCar(carmodel);
    }

    @Override
    public String onlyForTest(String s) {
        return s;
    }

    @Override
    public int getSpeed(String vstup) {
        int speed=0;
        for(CarModel x : getEveryCar()){
            if(x.getModel().startsWith(vstup))
                speed=x.getSpeed();
        }
        return speed;
    }

}