package cz.fkreporyje.database.Impl;

import cz.fkreporyje.database.CarDatabaseInterface;
import cz.fkreporyje.model.CarModel;
import org.springframework.stereotype.Service;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CarDatabaseImpl implements CarDatabaseInterface {

    public static final String DATABASE_PRIMITIVE_DATABASE_TXT = "springConsoleApplication/zooPrimitiveDatabase.txt";
    private File databaseFile;

    public CarDatabaseImpl() {
        try {
            databaseFile = new File(DATABASE_PRIMITIVE_DATABASE_TXT );
            databaseFile.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void insertCarToDatabase(CarModel carModel) {
        try {
            String carObjectInString = getStringFromCarModel(carModel);
            Files.write(databaseFile.toPath(), (carObjectInString + System.lineSeparator()).getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("došlo k chybě");
        }
    }


    @Override
    public List<CarModel> getAllCarsFromDatabase() {
        try {
            Path path = Paths.get(databaseFile.toURI());
            Stream<String> lines = Files.lines(path);
            List<CarModel> list = new ArrayList<>();
            for (String data : lines.collect(Collectors.toList())) {
                list.add(getCarModelFromString(data));
            }
            return list;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void clearDatabasee() {
        try {
            Path path = Paths.get(databaseFile.toURI());
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private String getStringFromCarModel(CarModel carModel) {
        String data = carModel.getModel() + ";" + carModel.getSpeed();
        return data;
    }

    private CarModel getCarModelFromString(String carInString) {
        CarModel carModel = new CarModel();
        String[] split = carInString.split(";");
        carModel.setModel(split[0]);
        carModel.setSpeed(Integer.valueOf(split[1]));
        return carModel;

    }
}


