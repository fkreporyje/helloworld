package cz.fkreporyje.helloworld.model;

public class BookModel {

    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return bookName;
    }
}
