package com.budgetmanager.backend.Services;

import com.budgetmanager.backend.Controllers.CategoryController;
import com.budgetmanager.backend.Dto.CategoryDto;
import com.budgetmanager.backend.Entities.Category;
import com.budgetmanager.backend.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service

public class CategoryService {
    @Autowired
   private CategoryRepository CR;
    public List<CategoryDto> getAllCategories() {
      return  CR.findAll().stream().map(this::getCategoryDto).collect(Collectors.toList());
    }
    private CategoryDto getCategoryDto(Category category) {
        CategoryDto Cdto = new CategoryDto();
       Cdto.setId(category.getId());
       Cdto.setName(category.getName());
       return Cdto;

    }
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());

        Category savedCategory = CR.save(category);
        return convertToDto(savedCategory);
    }

    public CategoryDto updateCategory(Long id, CategoryDto categoryDto) {
        Category existingCategory = CR.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));

        existingCategory.setName(categoryDto.getName());
        Category updatedCategory = CR.save(existingCategory);
        return convertToDto(updatedCategory);
    }

    private CategoryDto convertToDto(Category category) {
        CategoryDto dto = new CategoryDto();
        dto.setId(category.getId());
        dto.setName(category.getName());
        return dto;
    }



}
