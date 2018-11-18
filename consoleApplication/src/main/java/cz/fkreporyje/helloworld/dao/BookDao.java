package cz.fkreporyje.helloworld.dao;

import cz.fkreporyje.helloworld.model.BookModel;


public interface BookDao {

    void addBook(BookModel bookModel);
    String printAll(BookModel x);

    void clearAll(BookModel bookModel);
}
