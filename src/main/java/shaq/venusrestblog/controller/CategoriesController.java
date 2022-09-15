package shaq.venusrestblog.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shaq.venusrestblog.data.Category;
import shaq.venusrestblog.repository.CategoriesRepository;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/categories", produces = "application/json")
public class CategoriesController {
    private CategoriesRepository categoriesRepository;

    @GetMapping("")
    private List<Category> fetchPostsByCategory(@RequestParam String categoryName) {


        return categoriesRepository.findAll();
    }

}