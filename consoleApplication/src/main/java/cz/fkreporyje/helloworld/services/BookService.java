package cz.fkreporyje.helloworld.services;

import cz.fkreporyje.helloworld.model.BookModel;

import java.util.List;

public interface BookService {

    void addBook(BookModel book);
    List<BookModel>  getAllBooks();
    List<BookModel> clearAll();
    BookModel getBookById(long toFind);
    double getPriceForBooksStartWithLetter(String letter);
}
