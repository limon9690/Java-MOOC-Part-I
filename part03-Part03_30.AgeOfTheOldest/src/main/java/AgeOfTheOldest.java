
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = 0;

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] strArray = str.split(",");
            maxAge = Math.max(maxAge, Integer.valueOf(strArray[1]));
        }

        System.out.println("Age of the oldest: " + maxAge);

    }
}
