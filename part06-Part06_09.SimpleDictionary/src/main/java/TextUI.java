import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI (Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start () {
        
        while (true) {
            System.out.print("Command:");
            String cmd = scanner.nextLine();

            if (cmd.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (cmd.equals("add")) {
                System.out.print("Word:");
                String word = scanner.nextLine();

                System.out.println("");

                System.out.println("Translation:");
                String translation = scanner.nextLine();

                simpleDictionary.add(word, translation);
            }

            if (cmd.equals("search")) {
                System.out.print("To be translated:");
                String toBeTranslated = scanner.nextLine();

                String value = simpleDictionary.translate(toBeTranslated);

                if (value != null) {
                    System.out.println("Translation: " + simpleDictionary.translate(toBeTranslated));
                } else {
                    System.out.println("Word " + toBeTranslated + " was not found");
                }
                

            }
            
            System.out.println("Unknown command");
        }
    }
    
}
