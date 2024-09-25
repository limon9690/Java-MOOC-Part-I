
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int longest = 0;
        String name = "";
        int counter = 0;

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] strArray = str.split(",");
            if (strArray[0].length() > name.length()) {
                //longest = Integer.valueOf(strArray[1]);
                name = strArray[0];
            }

            sum += Integer.valueOf(strArray[1]);
            counter++;
        }

        double average = (double) sum / counter;

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);

    }
}
