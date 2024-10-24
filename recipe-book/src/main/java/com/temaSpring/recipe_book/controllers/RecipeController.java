package com.temaSpring.recipe_book.controllers;

import com.temaSpring.recipe_book.models.Recipe;
import com.temaSpring.recipe_book.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipes")
    public String getAllRecpies(Model model){

        model.addAttribute("recipes", recipeService.getAllRecipes());

        return "index";

    }

    @GetMapping("/recipes/add")
    public String showAddRecipeForm(Model model){

        model.addAttribute("recipe", new Recipe());
        return "addRecipe";

    }

    @PostMapping("/recipes/add")
    public String addRecipe(@ModelAttribute Recipe recipe){

        recipeService.addRecipe(recipe);

        return "redirect:/recipes";

    }

}
