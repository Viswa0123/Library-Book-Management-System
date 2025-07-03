import java.util.Scanner;

public class LibraryIO {
    private static final Scanner in = new Scanner(System.in);

    public static void getWelcome() {
        System.out.println("*********** Welcome to Library System ***********");
    }

    public static void printMenu() {
        System.out.println("""
                \n1. Add Book\s
                2. View Books\s
                3. Borrow Book\s
                4. Return Book\s
                5. Exit
                """);
    }

    public static int getChoice() {
        System.out.print("Enter your choice: ");
        return in.nextInt();
    }

    public static int getBookId(String action) {
        System.out.print("Enter Book ID to " + action + ": ");
        return in.nextInt();
    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }

    public static String readString(String prompt) {
        System.out.print(prompt);
        in.nextLine();
        return in.next();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
