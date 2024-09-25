import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface (TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            
            System.out.print("Command:");
            String cmd = scanner.nextLine();

            if (cmd.equals("stop")) {
                break;
            }

            if (cmd.equals("add")) {
                System.out.print("To add:");
                String toAdd = scanner.nextLine();

                todoList.add(toAdd);
            }

            if (cmd.equals("list")) {
                todoList.print();
            }

            if (cmd.equals("remove")) {
                System.out.print("Which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());

                todoList.remove(toRemove);
            }

        }
    }
    
}
