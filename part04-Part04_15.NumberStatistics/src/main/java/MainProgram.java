
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        Statistics statisticsSum = new Statistics();
        Statistics statisticsSumEven = new Statistics();
        Statistics statisticsSumOdd = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                statisticsSumEven.addNumber(num);
            }

            if (num % 2 != 0) {
                statisticsSumOdd.addNumber(num);
            }
            
            statisticsSum.addNumber(num);

        }

        System.out.println("Sum: " + statisticsSum.sum());
        System.out.println("Sum of even numbers: " + statisticsSumEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsSumOdd.sum());

    }
}
