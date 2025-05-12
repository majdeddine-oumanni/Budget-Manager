package com.budgetmanager.backend.Controllers;

import com.budgetmanager.backend.Entities.Category;
import com.budgetmanager.backend.Repositories.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryRepository categoryR;
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryR = categoryRepository;
    }
  @GetMapping("/list")
    public List<Category> Categorylist() {
        return categoryR.findAll();
  }
  @PostMapping("/add")
    public Category addCategory(@RequestBody Category category) {
        return categoryR.save(category);
  }

  @DeleteMapping("/delete/{id}")
    public void  deleteCategory(@PathVariable Long id) {
        categoryR.deleteById(id);
  }
  @PutMapping("/update/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
        return categoryR.save(category);
  }
}
