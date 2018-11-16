package cz.fkreporyje.helloworld.dao;

import cz.fkreporyje.helloworld.model.BookModel;


public interface BookDao {

    void addBook(BookModel bookModel);
    void vytiskeAll(BookModel x);


}
