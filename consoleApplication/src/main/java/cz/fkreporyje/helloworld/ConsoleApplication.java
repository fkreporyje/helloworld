package cz.fkreporyje.helloworld;

import java.util.Arrays;
import java.util.List;

import cz.fkreporyje.helloworld.model.BookModel;
import cz.fkreporyje.helloworld.services.BookService;
import cz.fkreporyje.helloworld.services.ServiceTest;
import cz.fkreporyje.helloworld.services.impl.BookServiceImpl;
import cz.fkreporyje.helloworld.services.impl.ServiceTestImpl;

import static java.lang.System.exit;


public class ConsoleApplication  {

    public static void main(String[] args) {
        try {

            BookService bookService = new BookServiceImpl();
            BookModel bookModel = new BookModel("Kniha o Vocim, aneb jak míč netrefil",101);
            bookService.addBook(bookModel);;

            BookModel bookModel2 = new BookModel("Druhá kniha o Svobym, jak míč si povodil :)",102);
            bookService.addBook(bookModel2);
            bookService.printAll(bookModel2);

            bookService.getBookById(102);






        } catch (Exception ex) {

        } finally {
            exit(0);
        }
    }
}
