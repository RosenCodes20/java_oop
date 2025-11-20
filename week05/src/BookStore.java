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

    public Book[] returnBooksByGenre(String genre) {
        Book[] matchedBooks = new Book[this.books.toArray().length];
        int counter = 0;

        for (Book book: this.books) {
            if (book.genre.equals(genre)) {
                matchedBooks[counter] = book;
            }

            counter++;
        }

        return matchedBooks;
    }
}
