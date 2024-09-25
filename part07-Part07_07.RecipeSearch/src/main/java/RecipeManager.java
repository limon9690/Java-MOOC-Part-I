import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager{
    private Scanner scanner;
    private ArrayList<Recipe> recipeList;

    public RecipeManager (Scanner scanner) {
        this.recipeList = new ArrayList<>();
        this.scanner = scanner;
    }

    public void add (Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public ArrayList<Recipe> getRecipeList() {
        return this.recipeList;
    }

    public void findByIngredient (String ingredient) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipeList) {
            ArrayList<String> ingredients = recipe.getIngredients();
            for (String ingred : ingredients) {
                if (ingred.equals(ingredient)) {
                    System.out.println(recipe);
                    break;
                }
            }
        }
    }

    public void listRecipe() {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipeList) {
            System.out.println(recipe);
        }
    }

    public void findByCookingTime(int time) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipeList) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    public void findByName(String name) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipeList) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void readRecipe(String file) {
        try {
            File fileName = new File(file);
            scanner = new Scanner(fileName);

            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                this.recipeList.add(recipe);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}