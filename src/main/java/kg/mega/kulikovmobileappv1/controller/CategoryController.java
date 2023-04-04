package kg.mega.kulikovmobileappv1.controller;

import kg.mega.kulikovmobileappv1.model.Category;
import kg.mega.kulikovmobileappv1.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor

public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping("/save")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }
}
