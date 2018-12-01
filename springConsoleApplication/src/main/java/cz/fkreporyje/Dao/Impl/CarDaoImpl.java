package cz.fkreporyje.Dao.Impl;

import cz.fkreporyje.Dao.CarDao;
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
    public void addCar(CarModel carmodel) {
        databaseOfCars.add(carmodel);
    }

    @Override
    public ArrayList<CarModel> getEveryCar() {
        return databaseOfCars;
    }
}
