package cz.fkreporyje.helloworld.services;

import cz.fkreporyje.helloworld.model.BookModel;

public interface BookService {

    void addBook(BookModel book);
    void printAll(BookModel book);
    void clearAll(BookModel book);
    void getBookById(long toFind);
}
