package cz.fkreporyje.helloworld.dao;

import cz.fkreporyje.helloworld.model.BookModel;

import java.util.List;


public interface BookDao {

    void addBook(BookModel bookModel);
    List<BookModel> getAllBooks();
    BookModel getBookById(long toFind);

    void clearAll(BookModel bookModel);
}
