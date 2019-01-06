package cz.fkreporyje.database.Impl;

import cz.fkreporyje.database.ShoopDatabaseInterface;
import cz.fkreporyje.model.MovieModel;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

@Service

public class ShoopDatabaseImpl implements ShoopDatabaseInterface {


    //Rejža rozpracovaný úkol


    //načtení textového souboru do programu

    public void readShoopDatabase() throws Exception {

        File file = new File ("springConsoleApplication/shoopDatabase.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine ()) != null)
            System.out.println(st);


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
