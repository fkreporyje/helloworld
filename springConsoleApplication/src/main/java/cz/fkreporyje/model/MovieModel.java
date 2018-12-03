package cz.fkreporyje.model;

public class MovieModel {

    int year;
    String name;
    String genre;


    public MovieModel (int year, String name, String genre) {


        this.year=year;
        this.name=name;
        this.genre=genre;

    }


    public int getYear () {

        return year;

    }

    public String getName () {

        return name;
    }

    public String getGenre () {

        return genre;
    }
}
