
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        double num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double num2 = Integer.valueOf(scanner.nextLine());

        int addition = (int) (num1 + num2);
        int subtraction = (int) (num1 - num2);
        int multiplication = (int) (num1 * num2);
        double division = num1 / num2;

        System.out.println((int) num1 + " + " + (int) num2 + " = " + addition);
        System.out.println((int) num1 + " - " + (int) num2 + " = " + subtraction);
        System.out.println((int) num1 + " * " + (int) num2 + " = " + multiplication);
        System.out.println((int) num1 + " / " + (int) num2 + " = " + division);

    }
}
