package com.budgetmanager.backend.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "budgets")  // Changed from "budget" to "budgets" (plural is conventional)
@NoArgsConstructor
@AllArgsConstructor
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "budget_limit")  // Changed from "limit" (SQL keyword)
    private double limit;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;
}