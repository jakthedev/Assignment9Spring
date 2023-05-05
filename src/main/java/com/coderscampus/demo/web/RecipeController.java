package com.coderscampus.demo.web;

import com.coderscampus.demo.domain.Recipe;
import com.coderscampus.demo.service.RecipeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes")
    public String getRecipes() {
        return recipeService.getMessage();
    }
}
