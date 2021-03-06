package cz.fkreporyje.helloworld.model;

public class BookModel {

    private String bookName;
    private long id;
    private Double price;

    public BookModel(long id, String bookName, double price) {
        this.bookName = bookName;
        this.id = id;
        this.price = price;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return bookName;
    }


}
