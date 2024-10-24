package com.temaSpring.recipe_book.models;

import lombok.Data;

@Data

public class Recipe {

    private String recipeTitle;
    private String ingredients;
    private String preparationSteps;
    private String description;
    private int cookingTime;

}
