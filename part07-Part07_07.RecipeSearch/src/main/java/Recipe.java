import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCookingTime(int time) {
        this.cookingTime = time;
    }
     
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String toString() {
        return "" + this.name + ", cooking time: " + this.cookingTime;
    }
}