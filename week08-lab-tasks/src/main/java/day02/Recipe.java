package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {
    private String name;
    private List<String> ingredients = new ArrayList<>();
    private String recipeDescription;

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String recipeDescription) {
        this.name = name;
        this.recipeDescription = recipeDescription;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void addIngredient(String s, String... more) {
        ingredients.add(s);
        ingredients.addAll(Arrays.asList(more));
    }
}