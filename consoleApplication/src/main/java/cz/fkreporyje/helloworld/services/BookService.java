package cz.fkreporyje.helloworld.services;

import cz.fkreporyje.helloworld.model.BookModel;

import java.util.List;

public interface BookService {

    void addBook(BookModel book);
    List<BookModel>  getAllBooks();
    void clearAll(BookModel book);
    BookModel getBookById(long toFind);
}
