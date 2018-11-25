package cz.fkreporyje.helloworld.services.impl;


import cz.fkreporyje.helloworld.model.BookModel;
import cz.fkreporyje.helloworld.services.BookService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookServiceImplTest {

    BookService bookservice = new BookServiceImpl();

    @Test
    public void getPriceTest(){
        assertEquals(677, bookservice.getPriceForBooksStartWithLetter("K"),0);
    }

    @Test
    public void getBookByID(){
        assertEquals("Druhá kniha o Svobym, jak míč si povodil :)",bookservice.getBookById(102));
    }


}
