package cz.fkreporyje.helloworld.dao.impl;

import cz.fkreporyje.helloworld.dao.BookDao;
import cz.fkreporyje.helloworld.model.BookModel;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    List<BookModel> scifiDatabaseWithBooks;

    public BookDaoImpl() {
        createScifiDatabase();
    }

    private void createScifiDatabase() {
        scifiDatabaseWithBooks = new ArrayList<>();
    }


    @Override
    public void addBook(BookModel bookModel) {
        scifiDatabaseWithBooks.add(bookModel);
        System.out.println("Save book to DB");
    }

    @Override
    public List<BookModel> getAllBooks() {
        return scifiDatabaseWithBooks;
    }

    @Override
    public BookModel getBookById(long toFind){
        //Inicializovat objekt podle mě dost dobře nejde, ne?
        for (BookModel g : scifiDatabaseWithBooks) {
            if (g.getId() == toFind)
               return g;
        }
        return null;                      //Zde bych potřeboval aby návratový typ byl objekt BookModel
    }



    @Override
    public void clearAll(BookModel bookModel) {
        scifiDatabaseWithBooks.clear();
        System.out.println("Všechny knihy odstraněny");
    }


}
