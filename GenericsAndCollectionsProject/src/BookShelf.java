import java.util.ArrayList;
import java.util.HashSet;

public class BookShelf {
    public static void main(String[] args) {
        ArrayList<ShelfRow> shelf =  new ArrayList<ShelfRow>();

        Book b1 = new Book("a1");
        Book b2 = new Book("a2");
        Book b3 = new Book("a3");

        Book b4 = new Book("a1");
        Book b5 = new Book("a4");
        Book b6 = new Book("a5");

        ShelfRow row1 = new ShelfRow();
        row1.addBookToShelf(b1);
        row1.addBookToShelf(b2);
        row1.addBookToShelf(b3);

        ShelfRow row2 = new ShelfRow();
        row2.addBookToShelf(b4);
        row2.addBookToShelf(b5);
        row2.addBookToShelf(b6);

        shelf.add(row1);
        shelf.add(row2);

        for (ShelfRow shelfRow : shelf) {
            System.out.println(shelfRow.row.toString());
        }
    }
}

class ShelfRow{
    HashSet <Book> row = new HashSet<Book>();

    void addBookToShelf(Book b) {
        row.add(b);
    }
}

class Book {
    String BookName;

    public Book(String bookName) {
        BookName = bookName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                '}';
    }
}