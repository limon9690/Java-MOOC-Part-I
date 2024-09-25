import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            String year = scanner.nextLine();

            bookList.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed?");
        String decision = scanner.nextLine();

        if (decision.equals("everything")) {
            for (Book b : bookList) {
                System.out.println(b.toString());
            }
        } else {
            for (Book b : bookList) {
                System.out.println(b.getName());
            }
        }

    }
}
