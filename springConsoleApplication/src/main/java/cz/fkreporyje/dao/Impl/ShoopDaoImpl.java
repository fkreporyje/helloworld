package cz.fkreporyje.dao.Impl;

import cz.fkreporyje.dao.ShoopDao;
import cz.fkreporyje.model.MovieModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ShoopDaoImpl implements ShoopDao {


    public ShoopDaoImpl() {

        createDatabase();

    }

    ArrayList<MovieModel> databaseOfMovies = new ArrayList<>();


    private void createDatabase() {

        databaseOfMovies.add(new MovieModel(1995, "Jízda", "Drama"));
        databaseOfMovies.add(new MovieModel(2001, "Harry Potter a kámen Mudrců", "Scifi"));

    }


    @Override
    public ArrayList<MovieModel> getEveryMovie() {
        return databaseOfMovies;
    }
}


