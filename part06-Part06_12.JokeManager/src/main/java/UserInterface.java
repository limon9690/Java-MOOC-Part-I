import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface (JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while(true){
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");

        String command = scanner.nextLine();

        if (command.equals("X")) {
            break;
        }


        if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            jokeManager.addJoke(joke);
        } else if (command.equals("2")) {
            System.out.println("Drawing a joke.");
            System.out.println(jokeManager.drawJoke());
        } else if (command.equals("3")) {
            jokeManager.printJokes();
        }
        
    }
    }

}


