
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                System.out.println("Sum of the numbers: " + sum);
                break;
            }

            sum += input;

        }

    }
}
