package cz.fkreporyje.helloworld.services.impl;

import cz.fkreporyje.helloworld.dao.BookDao;
import cz.fkreporyje.helloworld.dao.impl.BookDaoImpl;
import cz.fkreporyje.helloworld.model.BookModel;
import cz.fkreporyje.helloworld.services.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    BookDao bookDao = new BookDaoImpl();


    @Override
    public void addBook(BookModel book) {
        bookDao.addBook(book);
    }

    @Override
    public List<BookModel> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public void clearAll() {
        bookDao.clearAll();
    }


    @Override
    public BookModel getBookById(long toFind){
        return bookDao.getBookById(toFind);
    }



    public double getPriceForBooksStartWithLetter(String letter){
        double price=0;
        for (BookModel x : getAllBooks()){
            if(x.getBookName().startsWith(letter))
                price+=x.getPrice();
        }
        return price;
    }




}
