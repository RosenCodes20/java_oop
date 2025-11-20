import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Pod Igoto", "Ivan Vazov", 350, "Roman");
        Book book1 = new Book("Tutun", "Atanas Dalchev", 400, "Roman");
        Book book2 = new Book("Pod Igoto", "Rosen Ivanov", 450, "Razkaz");

        ArrayList<Book> books = new ArrayList<>();

        books.add(book);
        books.add(book1);
        books.add(book2);

        BookStore bookStore = new BookStore(books);

        ArrayList<Book> matchedBooks = bookStore.returnMatchedBooksByTitle("Pod Igoto");
        Book[] matchedBooksByGenre = bookStore.returnBooksByGenre("Roman");
        for (Book mathcedBook: matchedBooks) {
            System.out.println("Book title: " + mathcedBook.title +
                    " Book author: " + mathcedBook.authorName
                    + " Pages count: " + mathcedBook.pages +
                    " Book genre: " + mathcedBook.genre
            );
        }

        for (Book bookByGenre: matchedBooksByGenre) {
            if (bookByGenre != null) {
                System.out.println("Book title: " + bookByGenre.title +
                        " Book author: " + bookByGenre.authorName
                        + " Pages count: " + bookByGenre.pages +
                        " Book genre: " + bookByGenre.genre
                );
            } else {
                System.out.println("Error with matching this book : (");
            }
        }
    }
}