import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private BirdManager birdManager;

    public UI (Scanner scanner, BirdManager birdManager) {
        this.scanner = scanner;
        this.birdManager = birdManager;
    }

    public void start () {
        while (true) {
            System.out.print("? ");
            String cmd = scanner.nextLine();

            if (cmd.equals("One")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();

                birdManager.printOneBird(bird);
            }

            if (cmd.equals("Quit")) {
                break;
            }

            if (cmd.equals("All")) {
                birdManager.printBirds();
            }

            if (cmd.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();

                birdManager.handleObservation(bird);
            }

            if (cmd.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();

                Bird bird = new Bird(name, latinName);
                birdManager.add(bird);
            }

            if (cmd.equals("quit")) {
                break;
            }
        }
    }
    
}
