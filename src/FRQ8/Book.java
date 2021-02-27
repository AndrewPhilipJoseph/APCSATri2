package FRQ8;
import java.util.ArrayList;



public class Book
{
    private String title;
    private String author;

    public Book(String t, String a)
    {
        title = t;
        author = a;
    }

    public void printBookInfo()
    {
        System.out.print(title + ", written by " + author);
    }
}



class PictureBook extends Book {
    private String illustrator;

    public PictureBook(String t, String a, String illustrator) {
        super(t, a);
        this.illustrator = illustrator;
    }

@Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.println("illustrator:" + illustrator);
    }

}


class run {

    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        /*missing code*/
        Book book1 = new Book("Frankenstein",  "Mary Shelley");
        Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow"
        );
        myLibrary.add(book1);
        myLibrary.add(book2);
    }



}

class BookListing {
    private Book book;
    private double price;

    public BookListing(Book book, double price) {
        this.book = book;
        this.price = price;
    }

    public void printInfo() {
        book.printBookInfo();
        System.out.println("price:" + price);
    }
}
