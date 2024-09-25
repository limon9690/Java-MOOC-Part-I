
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        int capacity = 100;


        while (true) {
            //System.out.print("> ");

            System.out.println("First: " + first.contains() + "/" + capacity);
            System.out.println("Second: " + second.contains() + "/" + capacity);

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("quit")) {
                break;
            }

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                  second.add(amount);
                  first.remove(amount);
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }



        }
    }

}
