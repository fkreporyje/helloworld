package cz.fkreporyje.database.Impl;

import cz.fkreporyje.database.CarDatabaseInterface;
import cz.fkreporyje.model.CarModel;
import org.springframework.stereotype.Service;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CarDatabaseImpl implements CarDatabaseInterface {

    public static final String DATABASE_PRIMITIVE_DATABASE_TXT = "springConsoleApplication/xxxx.txt";
    private File databaseFile;

    public CarDatabaseImpl() {
        try {
            databaseFile = new File(DATABASE_PRIMITIVE_DATABASE_TXT);
            databaseFile.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void insertCarToDatabase(CarModel carModel) {
        try {
            String carObjectInString = getStringFromCarModel(carModel);
            Files.write(databaseFile.toPath(), (carObjectInString).getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            //Files.write(databaseFile.toPath(), (carObjectInString + System.lineSeparator()).getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);


        } catch (IOException e) {
            System.out.println("došlo k chybě");
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
        return "Model:"+ carModel.getModel()+"," + "Speed:" + carModel.getSpeed()+"; ";

    }

    private CarModel getCarModelFromString(String carInString) {
        CarModel carModel = new CarModel();
        int firstIndex=carInString.indexOf(':');   //řetězec až po rozdělovač vyjádřený čárkou
        int secondIndex=carInString.indexOf(',');//řetězec až po rozdělovač vyjádřený čárkou
        int thirdIndex=carInString.indexOf("d:");

        String firstString=carInString.substring(firstIndex+1,secondIndex);
        String secondString=carInString.substring(thirdIndex+2);

        carModel.setModel(firstString);
        carModel.setSpeed(Integer.parseInt(secondString));

        return carModel;

        //String[] partOfString = carInString.split(",");
        //carModel.setModel(partOfString[0]);
        //carModel.setSpeed(Integer.valueOf(partOfString[1]));
    }


    @Override
    public List<CarModel> getallCarsFromDatabase_02(){

        try {
            String content = new String(Files.readAllBytes(Paths.get(databaseFile.toURI())));
            String[] stringArray = content.split("; ");
            List<CarModel> list = new ArrayList<>();
            for (String jmena : stringArray) {
                list.add(getCarModelFromString(jmena));
            }
            return list;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}


