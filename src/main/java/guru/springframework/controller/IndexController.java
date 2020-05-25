package guru.springframework.controller;


import guru.springframework.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Optional;

@Controller
public class IndexController {


    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    private final RecipeService recipeService;



    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipe());

        return "index";
    }
}
