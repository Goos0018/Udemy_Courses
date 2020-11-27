package be.vdab.spring5recipeproject.controllers;

import be.vdab.spring5recipeproject.domain.Category;
import be.vdab.spring5recipeproject.domain.UnitOfMeasure;
import be.vdab.spring5recipeproject.repositories.CategoryRepository;
import be.vdab.spring5recipeproject.repositories.UnitOfMeasureRepository;
import be.vdab.spring5recipeproject.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
     public String getIndexPage(Model model){
        log.debug("Getting index page");

        model.addAttribute("recipes", recipeService.getRecipes());

         return "index";
     }
}
