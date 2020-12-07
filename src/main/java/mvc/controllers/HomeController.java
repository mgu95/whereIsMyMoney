package mvc.controllers;

import core.services.CategoryService;
import data.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/home")
public class HomeController {

    private CategoryService categoryService;

    @Autowired
    public HomeController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String getHome() {

        Category[] categories = categoryService.getAllCategories();
        System.out.println("categories.lenght = " + categories.length);
        for (Category c : categories) {
            System.out.println(c);
        }

        return "home";
    }
}
