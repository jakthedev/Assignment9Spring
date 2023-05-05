package com.coderscampus.demo.web;

import com.coderscampus.demo.domain.Recipe;
import com.coderscampus.demo.service.RecipeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    private RecipeService recipeService;
    private  Recipe recipe;

    public RecipeController(RecipeService recipeService, Recipe recipe){
        this.recipeService = recipeService;
        this.recipe = recipe;
    }

    @GetMapping("/recipes")
    public String getRecipes() {
        return recipeService.getMessage();
    }

    @GetMapping("/recipe")
    public String whatsInRecipes() {
        return recipe.toString();
    }
}
