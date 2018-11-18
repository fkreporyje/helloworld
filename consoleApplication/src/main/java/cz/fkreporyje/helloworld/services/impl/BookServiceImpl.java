package cz.fkreporyje.helloworld.services.impl;

import cz.fkreporyje.helloworld.dao.BookDao;
import cz.fkreporyje.helloworld.dao.impl.BookDaoImpl;
import cz.fkreporyje.helloworld.model.BookModel;
import cz.fkreporyje.helloworld.services.BookService;

public class BookServiceImpl implements BookService {

    BookDao bookDao = new BookDaoImpl();
    long toFind;


    @Override
    public void addBook(BookModel book) {
        bookDao.addBook(book);
    }

    @Override
    public void printAll(BookModel book) {
        System.out.println(bookDao.printAll(book));
    }

    @Override
    public void getBookById(long toFind){
        System.out.println(bookDao.getBookById(toFind));
    }
}

