package com.budgetmanager.backend.Controllers;

import com.budgetmanager.backend.Dto.CategoryDto;
import com.budgetmanager.backend.Entities.Category;
import com.budgetmanager.backend.Repositories.CategoryRepository;
import com.budgetmanager.backend.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryRepository categoryR;
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryR = categoryRepository;
    }
    @Autowired
    private CategoryService CS;

  @GetMapping("/Category/list")
    public List<CategoryDto> Categorylist() {
        return  CS.getAllCategories();

  }
  @PostMapping("/Category/add")
  public ResponseEntity<CategoryDto> createCategory( @RequestBody CategoryDto categoryDto) {
      CategoryDto createdCategory = CS.createCategory(categoryDto);
      return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
  }

  @DeleteMapping("/Category/delete/{id}")
    public void  deleteCategory(@PathVariable Long id) {
        categoryR.deleteById(id);
  }
  @PutMapping("/Category/update/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
        return categoryR.save(category);
  }
}
