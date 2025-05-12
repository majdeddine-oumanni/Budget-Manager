package com.budgetmanager.backend.Repositories;

import com.budgetmanager.backend.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
