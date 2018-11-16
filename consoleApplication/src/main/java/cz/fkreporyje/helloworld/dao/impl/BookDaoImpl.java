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
    public String printAll(BookModel bookModel) {
        String r="";
        for(BookModel z : scifiDatabaseWithBooks){
            r+=String.valueOf(z);
        }
            return r;
    }





}
