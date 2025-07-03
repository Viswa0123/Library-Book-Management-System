import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));
        LibraryIO.printMessage("Book added successfully!");
    }

    public void viewBooks() {
        LibraryIO.printMessage("Books:");
        for (Book book : books) {
            LibraryIO.printMessage(book.toString());
        }
    }

    public void borrowBook(int id) {
        Book book = findBook(id);
        if (book == null) {
            LibraryIO.printMessage("Book ID not found.");
        } else if (isBorrowed(book.getStatus())) {
            LibraryIO.printMessage("Book is already borrowed.");
        } else {
            book.setStatus(Status.BORROWED);
            LibraryIO.printMessage("Book borrowed successfully!");
        }
    }

    public void returnBook(int id) {
        Book book = findBook(id);
        if (book == null) {
            LibraryIO.printMessage("Book ID not found.");
        } else if (!isBorrowed(book.getStatus())) {
            LibraryIO.printMessage("Book was not borrowed.");
        } else {
            book.setStatus(Status.AVAILABLE);
            LibraryIO.printMessage("Book returned successfully!");
        }
    }

    private Book findBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    private boolean isBorrowed(Status status) {
        return status == Status.BORROWED;
    }
}
