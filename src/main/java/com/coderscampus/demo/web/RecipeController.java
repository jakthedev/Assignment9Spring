package com.coderscampus.demo.web;

import com.coderscampus.demo.domain.Recipe;
import com.coderscampus.demo.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RecipeController {



    private RecipeService recipeService;


    private Recipe recipe;

    @Value("${superuser.username}")
    private String superuserUsername;

    @Value("${superuser.password}")
    private String superuserPassword;

    @Value("${superuser.name}")
    private String superuserName;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;

    }

    @GetMapping("/all-recipes")
    public List<Recipe> getAllRecipes () {
        return recipeService.getAllRecipes();
    }
    @GetMapping("/")
    public List<String> readLines() throws IOException {
        System.out.println(superuserUsername);
        System.out.println(superuserPassword);
        System.out.println(superuserName);


        return null;
    }


    @GetMapping("/gluten-free")
    public List<Recipe> getGlutenFree () {

        return recipeService.getAllRecipes()
                .stream()
                .filter(Recipe::getGlutenFree)
                .collect(Collectors.toList());
    }

    @GetMapping("/vegan")
    public List<Recipe> getVegan () {
        return recipeService.getAllRecipes()
                .stream()
                .filter(Recipe::getVegan)
                .collect(Collectors.toList());
    }

    @GetMapping("/vegan-and-gluten-free")
    public List<Recipe> getVeganAndGlutenFree () {
        return recipeService.getAllRecipes()
                .stream()
                .filter(recipe -> recipe.getVegan() && recipe.getGlutenFree())
                .collect(Collectors.toList());
    }

    @GetMapping("/vegetarian")
    public List<Recipe> getVegetarian () {
        return recipeService.getAllRecipes()
                .stream()
                .filter(Recipe::getVegetarian)
                .collect(Collectors.toList());
    }


}
