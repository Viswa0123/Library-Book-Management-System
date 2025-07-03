import java.util.Scanner;

public class LibraryIO {
    private static final Scanner scanner = new Scanner(System.in);

    public static void printMenu() {
        System.out.println("\nWelcome to Library System");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. Exit");
    }

    public static int getChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static int getBookId(String action) {
        System.out.print("Enter Book ID to " + action + ": ");
        return scanner.nextInt();
    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static String readLine(String prompt) {
        System.out.print(prompt);
        scanner.nextLine(); // to clear newline
        return scanner.nextLine();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void closeScanner() {
        scanner.close();
    }
}
