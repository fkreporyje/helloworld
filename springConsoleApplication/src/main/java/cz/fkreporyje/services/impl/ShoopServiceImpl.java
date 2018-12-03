package cz.fkreporyje.services.impl;

import cz.fkreporyje.dao.ShoopDao;
import cz.fkreporyje.model.MovieModel;
import cz.fkreporyje.services.ShoopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ShoopServiceImpl implements ShoopService {

    @Autowired
    ShoopDao shoopDao;

    @Override
    public List<MovieModel> getEveryMovie() {
        return shoopDao.getEveryMovie();
    }

    @Override
    public String onlyForTest(String z) {
        return z;
    }




}
