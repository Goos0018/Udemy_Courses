package be.vdab.spring5recipeproject.repositories;

import be.vdab.spring5recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
