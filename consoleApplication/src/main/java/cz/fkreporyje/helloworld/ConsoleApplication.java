package cz.fkreporyje.helloworld;

import cz.fkreporyje.helloworld.model.BookModel;
import cz.fkreporyje.helloworld.services.BookService;
import cz.fkreporyje.helloworld.services.impl.BookServiceImpl;

import java.util.List;

import static java.lang.System.exit;


public class ConsoleApplication  {

    public static void main(String[] args) {
        try {

            BookService bookService = new BookServiceImpl();
            BookModel bookModel1 = new BookModel(101,"Kniha o Vocim, aneb jak míč netrefil",199);
            BookModel bookModel3 = new BookModel(103,"Konec fotbalu v čechách",249);
            BookModel bookModel4 = new BookModel(104,"Krok za krokem",229);
            BookModel bookModel2 = new BookModel(102,"Druhá kniha o Svobym, jak míč si povodil :)",299);

            bookService.addBook(bookModel1);
            bookService.addBook(bookModel3);
            bookService.addBook(bookModel4);
            bookService.addBook(bookModel2);

            List<BookModel> allBooks = bookService.getAllBooks();

            System.out.println(bookService.getBookById(102));
            System.out.printf("Máme k dispozici %s knihy začínající zadanou iniciálou",bookService.getPriceForBooksStartWithLetter("K"));







        } catch (Exception ex) {

        } finally {
            exit(0);
        }
    }
}
