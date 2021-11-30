package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {


    @Test
    void createRecipeOnlyName() {
        Recipe recipe = new Recipe("Lecsó");

        assertEquals("Lecsó", recipe.getName());
        assertNull(recipe.getRecipeDescription());
        assertEquals(0,recipe.getIngredients().size());
    }

    @Test
    void createRecipeNameAndDescription() {
        Recipe recipe = new Recipe("Lecsó","Magyar étel");

        assertEquals("Lecsó", recipe.getName());
        assertEquals("Magyar étel",recipe.getRecipeDescription());
        assertEquals(0,recipe.getIngredients().size());
    }


    @Test
    void addIngredientTest() {
        Recipe recipe = new Recipe("Lecsó", "Magyar étel");

        recipe.addIngredient("paprika", "paradicsom", "hagyma");

        assertEquals(3, recipe.getIngredients().size());
        assertEquals("hagyma", recipe.getIngredients().get(2));

        assertArrayEquals(new String[] {"paprika","paradicsom","hagyma"}, recipe.getIngredients().toArray());
        assertEquals(List.of("paprika","paradicsom","hagyma"), recipe.getIngredients().toArray());
    }
}