package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String bookShopName;
    List<Book> books = new ArrayList<>();

    public String getBookShopName() {
        return bookShopName;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookShopName='" + bookShopName + '\'' +
                ", books=" + books +
                '}';
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for(Book book : this.getBooks()){
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }

    public void loadData(){
        for(int i=0; i<=10; i++){
            Book books = new Book();
            books.setBookId(i);
            books.setBookName("Book " + i);
            getBooks().add(books);
        }
    }
}
