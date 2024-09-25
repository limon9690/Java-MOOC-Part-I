
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] strArray = str.split(" ");
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].contains("av")) {
                    System.out.println(strArray[i]);
                }
            }

        }

    }
}
