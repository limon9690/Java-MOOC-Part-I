
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        List<Integer> list = new ArrayList<>();

        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                int num = Integer.valueOf(scanner2.nextLine());

                if (num >= lowerBound && num <= upperBound) {
                    list.add(num);
                }

            }
        } catch (Exception ex) {
            System.out.println("Error reading the file");
        }

        System.out.println("Numbers: " + list.size());

    }

}
