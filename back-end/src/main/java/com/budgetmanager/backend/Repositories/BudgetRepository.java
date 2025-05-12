package com.budgetmanager.backend.Repositories;

import com.budgetmanager.backend.Entities.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget,Long> {
}
