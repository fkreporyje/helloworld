package cz.fkreporyje.database.Impl;

import cz.fkreporyje.database.ShoopDatabaseInterface;
import cz.fkreporyje.model.MovieModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ShoopDatabaseImpl implements ShoopDatabaseInterface {


    //Rejža rozpracovaný úkol


    //načtení textového souboru do programu
    @Override
    public void readShoopDatabase() {

        File file = new File ("springConsoleApplication/shoopDatabase.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    //smaže obsah filu
    @Override
    public void clearDatabase() {

    }

    //vloží obsah do databáze
    @Override
    public void insertMovieToDatabase(MovieModel movieModel) {

    }


    //přepíše databázi do textáku
    @Override
    public List<MovieModel> writeAllMoviesToDatabase() {
        return null;
    }
}
