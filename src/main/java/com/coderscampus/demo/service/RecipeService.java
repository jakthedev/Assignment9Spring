package com.coderscampus.demo.service;

import com.coderscampus.demo.domain.Recipe;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

    private FileService fileService;

    public String getMessage() {
        return "Yo!";
    }

    public static Recipe createRecipeData(Integer cookingMinutes, Boolean dairyFree, Boolean glutenFree, String instructions,
                                          Double preparationMinutes, Double pricePerServing, Integer readyInMinutes, Integer servings,
                                          Double spoonacularScore, String title, Boolean vegan, Boolean vegetarian) {
        Recipe recipeInfo = new Recipe();
        recipeInfo.setCookingMinutes(cookingMinutes);
        recipeInfo.setDairyFree(dairyFree);
        recipeInfo.setGlutenFree(glutenFree);
        recipeInfo.setInstructions(instructions);
        recipeInfo.setPreparationMinutes(preparationMinutes);
        recipeInfo.setPricePerServing(pricePerServing);
        recipeInfo.setReadyInMinutes(readyInMinutes);
        recipeInfo.setServings(servings);
        recipeInfo.setSpoonacularScore(spoonacularScore);
        recipeInfo.setTitle(title);
        recipeInfo.setVegan(vegan);
        recipeInfo.setVegetarian(vegetarian);
        return recipeInfo;
    }


    public List<Recipe> readRecipes(String filename) throws FileNotFoundException, IOException {
        try {
            //List<String> Reader = fileService.readFile("recipe.txt");
            //Reader in = new FileReader(filename);

            List<Recipe> recipes = new ArrayList<>(); 
            Recipe recipeObj = new Recipe();

            // Read the CSV file into a list of CSV records.
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces().parse(new FileReader(filename));

            // For each CSV record, create a new Recipe object and add it to the list of recipes.
            for (CSVRecord record : records) {
                
            }

            return recipes;

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
