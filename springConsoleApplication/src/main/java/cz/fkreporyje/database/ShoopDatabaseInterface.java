package cz.fkreporyje.database;

import cz.fkreporyje.model.MovieModel;

import java.util.List;

public interface ShoopDatabaseInterface {

    void readShoopDatabase () throws Exception;
    void insertMovieToDatabase (MovieModel movieModel);
    void clearDatabase();
    List<MovieModel> writeAllMoviesToDatabase();


}
