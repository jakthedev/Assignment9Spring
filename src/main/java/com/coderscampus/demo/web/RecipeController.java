package com.coderscampus.demo.web;

import com.coderscampus.demo.domain.Recipe;
import com.coderscampus.demo.service.FileService;
import com.coderscampus.demo.service.RecipeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

@RestController
public class RecipeController {


    private FileService fileService;
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

    //@GetMapping("/gluten-free")

    //@GetMapping("/vegan")

    //@GetMapping("/vegan-and-gluten-free")

    //@GetMapping("/vegetarian")

    @GetMapping("/all-recipes")
    public ArrayList<Recipe> getAllRecipes() throws IOException {
        return (ArrayList<Recipe>) recipeService.readRecipes("recipe.txt");
    }


}
