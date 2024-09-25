import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private RecipeManager recipeManager;

    public UI (Scanner scanner, RecipeManager recipeManager) {
        this.scanner = scanner;
        this.recipeManager = recipeManager;
    }

    public void start () {
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        recipeManager.readRecipe(file);

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        //System.out.println("");

        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            
            String cmd = scanner.nextLine();

            if (cmd.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searchedIngredient = scanner.nextLine();

                System.out.println("");
                recipeManager.findByIngredient(searchedIngredient);
            }

            if (cmd.equals("find cooking time")) {
                System.out.print("Max cooking time:");
                int maxCookingTIme = Integer.valueOf(scanner.nextLine());

                System.out.println("");
                recipeManager.findByCookingTime(maxCookingTIme);
            }

            if (cmd.equals("find name")) {
                System.out.print("Searched word:");
                String searchedWord = scanner.nextLine();

                System.out.println("");
                recipeManager.findByName(searchedWord);
            }

            if (cmd.equals("list")) {
                 System.out.println("");
                recipeManager.listRecipe();
            }

            if (cmd.equals("stop")) {
                break;
            }
        }

    }
}