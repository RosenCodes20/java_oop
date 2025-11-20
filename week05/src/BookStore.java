import java.util.ArrayList;

public class BookStore {
    public ArrayList<Book> books;

    public BookStore(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> returnMatchedBooksByTitle(String title) {
        ArrayList<Book> matchedBooks = new ArrayList<>();

        for (Book book : this.books) {
            if (book.title.equals(title)) {
                matchedBooks.add(book);
            }
        }

        return matchedBooks;
    }
}
