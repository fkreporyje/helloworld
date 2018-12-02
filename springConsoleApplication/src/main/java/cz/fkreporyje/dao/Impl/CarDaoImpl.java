package cz.fkreporyje.dao.Impl;

import cz.fkreporyje.dao.CarDao;
import cz.fkreporyje.model.CarModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarDaoImpl implements CarDao {

    public CarDaoImpl() {
        createDatabase();
    }

    ArrayList<CarModel> databaseOfCars = new ArrayList<>();


    private void createDatabase() {
        databaseOfCars.add(new CarModel(100,"Škoda"));
        databaseOfCars.add(new CarModel(200,"Volvo"));
    }


    @Override
    public ArrayList<CarModel> getEveryCar() {
        return databaseOfCars;
    }
}
