
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int n = Integer.parseInt(scanner.nextLine());

        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        
        System.out.println(res);
    }
}
