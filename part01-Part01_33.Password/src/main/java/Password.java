
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String password = "Caput Draconis";

        String str = scan.nextLine();

        if (password.equals(str)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    }
}
