package be.vdab.spring5recipeproject.services;

import be.vdab.spring5recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
