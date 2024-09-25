
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.parseInt(scan.nextLine());

        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value >= 5000 && value < 25000) {
            if (value == 5000) {
                double tax = 100;
                System.out.println("Tax: " + tax);
            } else {
                double tax = 100 + ((value - 5000) * 0.08);
                System.out.println("Tax: " + tax);
            }
        } else if (value >= 25000 && value < 55000) {
            if (value == 25000) {
                double tax = 1700;
                System.out.println("Tax: " + tax);
            } else {
                double tax = 1700 + ((value - 25000) * 0.1);
                System.out.println("Tax: " + tax);
            }
        } else if (value >= 55000 && value < 200000) {
            if (value == 55000) {
                double tax = 4700;
                System.out.println("Tax: " + tax);
            } else {
                double tax = 4700 + ((value - 55000) * 0.12);
                System.out.println("Tax: " + tax);
            }
        }else if (value >= 200000 && value < 1000000) {
            if (value == 200000) {
                double tax = 22100;
                System.out.println("Tax: " + tax);
            } else {
                double tax = 22100 + ((value - 200000) * 0.15);
                System.out.println("Tax: " + tax);
            }
        } else {
            if (value == 1000000) {
                double tax = 142100;
                System.out.println("Tax: " + tax);
            } else {
                double tax = 142100 + ((value - 1000000) * 0.17);
                System.out.println("Tax: " + tax);
            }
        }



    }
}
