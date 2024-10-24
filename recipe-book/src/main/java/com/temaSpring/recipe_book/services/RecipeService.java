package com.temaSpring.recipe_book.services;


import com.temaSpring.recipe_book.models.Recipe;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RecipeService {

    List<Recipe> recipes = new ArrayList<>();

    public RecipeService(){

        initializeRecipes();

    }

    private void initializeRecipes() {

        Recipe r = new Recipe();
        r.setRecipeTitle("Macaroane cu branza");
        r.setDescription("Este gustos!");
        r.setIngredients("Macaroane, Branza");
        r.setCookingTime(15);
        r.setPreparationSteps("Amesteca cele 2 ingrediente.");
        recipes.add(r);

        Recipe r1 = new Recipe();
        r1.setRecipeTitle("Sandwich");
        r1.setDescription("Rapid de facut");
        r1.setIngredients("Felii de paine, carne, sosuri, cartofi, omleta");
        r1.setCookingTime(5);
        r1.setPreparationSteps("Combine ingredientele intre cele 2 felii de paine.");
        recipes.add(r1);

        Recipe r2 = new Recipe();
        r2.setRecipeTitle("Limonada");
        r2.setDescription("Bun pentru vara.");
        r2.setIngredients("Apa, lamai, zahar, menta");
        r2.setCookingTime(10);
        r2.setPreparationSteps("Se pune apa si sucul de lamaie intr-o carafa, apoi zaharul si se amesteca, la final se adauga menta (si eventual se poate amesteca iarasi.)");
        recipes.add(r2);

    }

    public List<Recipe> getAllRecipes (){

        return recipes;

    }

    public void addRecipe(Recipe r){

        recipes.add(r);

    }

}
