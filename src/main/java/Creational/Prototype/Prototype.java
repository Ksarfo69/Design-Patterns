package Creational.Prototype;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException{
        System.out.println("We are Prototyping.");


        BookShop bookShop = new BookShop();
        bookShop.setBookShopName("Acchatant");
        bookShop.loadData();

        BookShop newBookShop = bookShop.clone();
        bookShop.getBooks().remove(2);
        newBookShop.setBookShopName("Polo");


        System.err.println(bookShop);
        System.out.println(newBookShop);

    }
}
