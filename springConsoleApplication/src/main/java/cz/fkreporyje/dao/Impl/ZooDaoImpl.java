package cz.fkreporyje.dao.Impl;

import cz.fkreporyje.dao.ZooDao;
import cz.fkreporyje.database.ZooDatabaseInterface;
import cz.fkreporyje.model.AnimalModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooDaoImpl implements ZooDao {

    @Autowired
    ZooDatabaseInterface zooDatabaseInterface;

    @Override
    public void createAninamlRecord(AnimalModel animalModel) {
        zooDatabaseInterface.insertAnimalToDatabase(animalModel);
    }

    @Override
    public List<AnimalModel> getAllAnimals() {
        return zooDatabaseInterface.getAllAnimalFromDatabase();
    }

    @Override
    public void clearDatabase() {
zooDatabaseInterface.clearDatabase();
    }
}
