public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        int choice;
        LibraryIO.getWelcome();

        do {
            LibraryIO.printMenu();
            choice = LibraryIO.getChoice();

            switch (choice) {
                case 1:
                    int id = LibraryIO.readInt("Enter Book ID: ");
                    String title = LibraryIO.readString("Enter Title: ");
                    String author = LibraryIO.readString("Enter Author: ");
                    library.addBook(id, title, author);
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    int borrowId = LibraryIO.getBookId("borrow");
                    library.borrowBook(borrowId);
                    break;
                case 4:
                    int returnId = LibraryIO.getBookId("return");
                    library.returnBook(returnId);
                    break;
                case 5:
                    LibraryIO.printMessage("Thank you for using Library System.");
                    break;
                default:
                    LibraryIO.printMessage("Invalid choice.");
            }

        } while (choice != 5);

    }
}
