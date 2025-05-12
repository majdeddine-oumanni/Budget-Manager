package com.budgetmanager.backend.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Budget {
    @Id
    private Long id;
    private double limit;
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
