package com.budgetmanager.backend.Repositories;

import com.budgetmanager.backend.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
