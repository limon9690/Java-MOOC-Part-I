
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = 0;
        String name = "";

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] strArray = str.split(",");
            if (Integer.valueOf(strArray[1]) > maxAge) {
                maxAge = Integer.valueOf(strArray[1]);
                name = strArray[0];
            }
        }

        System.out.println("Name of the oldest: " + name);
    }
}
