package cz.fkreporyje.database.impl;

import cz.fkreporyje.database.ZooDatabaseInterface;
import cz.fkreporyje.model.AnimalModel;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
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
public class ZooDatabasePrimitiveImpl implements ZooDatabaseInterface {

    public static final String DATABASE_ZOO_PRIMITIVE_DATABASE_TXT = "springConsoleApplication/zooPrimitiveDatabase.txt";
    private File databaseFile;

    public ZooDatabasePrimitiveImpl() {
        try {
            databaseFile = new File(DATABASE_ZOO_PRIMITIVE_DATABASE_TXT);
            databaseFile.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void insertAnimalToDatabase(AnimalModel animalModel) {
        try {
            String animalObjectInString = getStringFromAnimalModel(animalModel);
            Files.write(databaseFile.toPath(), (animalObjectInString + System.lineSeparator()).getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<AnimalModel> getAllAnimalFromDatabase() {
        try {
            Path path = Paths.get(databaseFile.toURI());
            Stream<String> lines = Files.lines(path);
            List<AnimalModel> list = new ArrayList<>();
            for (String data : lines.collect(Collectors.toList())) {
                list.add(getAnimalModelFromString(data));
            }
            return list;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void clearDatabase() {
        try {
            Path path = Paths.get(databaseFile.toURI());
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private String getStringFromAnimalModel(AnimalModel animalModel) {
        String data = animalModel.getName() + ";" + animalModel.getAge();
        return data;
    }

    private AnimalModel getAnimalModelFromString(String animalInString) {
        AnimalModel animalModel = new AnimalModel();
        String[] split = animalInString.split(";");
        animalModel.setName(split[0]);
        animalModel.setAge(Integer.valueOf(split[1]));
        return animalModel;

    }
}
