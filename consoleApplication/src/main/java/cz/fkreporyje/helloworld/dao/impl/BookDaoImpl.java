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
        scifiDatabaseWithBooks.add(new BookModel(1,"Vinetou", 100.0));
        scifiDatabaseWithBooks.add(new BookModel(2,"Harry Poter", 200.0));
        scifiDatabaseWithBooks.add(new BookModel(3,"Pán Prstenů", 300.0));
        scifiDatabaseWithBooks.add(new BookModel(3,"Práskač", 400.0));
    }


    @Override
    public void addBook(BookModel bookModel) {
        scifiDatabaseWithBooks.add(bookModel);
        System.out.println("Save book to DB");
    }

    @Override
    public List<BookModel> getAllBooks() { return scifiDatabaseWithBooks;
    }

    @Override
    public BookModel getBookById(long toFind) {
        for (BookModel g : scifiDatabaseWithBooks) {
            if (g.getId() == toFind)
                return g;
        }
        return null;
    }

    @Override
    public  void clearAll() {
        scifiDatabaseWithBooks.clear();
        System.out.println("Všechny knihy odstraněny");
    }



    public double getPriceForBooksStartWithLetter(String letter){
        double numberOf=0;
        for (BookModel m : scifiDatabaseWithBooks) {
            if(m.getBookName().startsWith(letter))
                numberOf++;
        }
        return numberOf;


    }



}
