package com.coderscampus.demo.repository;

import com.coderscampus.demo.domain.Recipe;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {

    private List<Recipe> recipes = new ArrayList<>(100);

    public List<Recipe> getRecipes() {
        return recipes;
    }

}
