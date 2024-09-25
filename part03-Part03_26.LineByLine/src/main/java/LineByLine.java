
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] strArray = str.split(" ");
            for (int i = 0; i < strArray.length; i++) {
                System.out.println(strArray[i]);
            }

        }

    }
}
