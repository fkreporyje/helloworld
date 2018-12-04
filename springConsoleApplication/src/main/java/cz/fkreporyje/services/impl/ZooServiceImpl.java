package cz.fkreporyje.services.impl;

import cz.fkreporyje.dao.ZooDao;
import cz.fkreporyje.model.AnimalModel;
import cz.fkreporyje.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooServiceImpl implements ZooService {

    @Autowired
    ZooDao zooDao;

    @Override
    public void createAnimal(AnimalModel animalModel) {
        zooDao.createAninamlRecord(animalModel);
    }

    @Override
    public List<AnimalModel> getAllAnimalFromDatabase() {
        return zooDao.getAllAnimals();
    }

    @Override
    public void clearDatabase() {
        zooDao.clearDatabase();
    }
}
